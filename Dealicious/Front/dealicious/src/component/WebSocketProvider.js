// WebSocketProvider.js
import { createContext, useContext, useEffect, useState } from 'react';
import { Stomp } from '@stomp/stompjs';
import * as SockJS from 'sockjs-client';
import { useSelector } from 'react-redux';

const WebSocketContext = createContext();

export const WebSocketProvider = ({ children }) => {
  const [stompClient, setStompClient] = useState(null);
  const [receivedata, setReceivedata] = useState(null);
  // const url = "http://43.203.108.152/:8090/";
  const url = "http://localhost:8090/";
  const user = useSelector(state => state.persistedReducer.user);
  useEffect(() => {
    const createWebSocket = () => {
      // const sock = new SockJS('http://43.203.108.152:8090/ws');
      const sock = new SockJS('http://localhost:8090/ws');
      return Stomp.over(sock);
    };

    const connectWebSocket = () => {
      const client = createWebSocket();
      client.connect({}, () => {
        console.log('WebSocket connected');
        client.subscribe('/sub/chat/'+user.email, (message) => {
          // Handle incoming message, you can parse and set the data accordingly
          console.log("구독들어오니?");
          const messageData = JSON.parse(message.body);
          console.log(messageData);
          setReceivedata(messageData);
        });
      });


      setStompClient(client);
    };
    if (user.email !== undefined && user.email !== '') {
      console.log("소켓 연결 및 구독 시작");
      connectWebSocket();
    }
    return () => {
      if (stompClient && stompClient.connected) {
        stompClient.disconnect();
      }
    };
  }, []);

  const sendDataToServer = (data) => {
    // 여기에서 stompClient를 이용하여 데이터 서버로 전송
    if (stompClient && stompClient.connected) {
      console.log("provider")
      console.log(data)
      stompClient.send('/pub/chat', {}, JSON.stringify(data));
    }
  };
  const resetData = () => {
    setReceivedata(null);
  };

  return (
    <WebSocketContext.Provider value={{ stompClient, receivedata, resetData, sendDataToServer,url }}>
      {children}
    </WebSocketContext.Provider>
  );
};

export const useWebSocket = () => {
  const { stompClient, receivedata, resetData, sendDataToServer,url } = useContext(WebSocketContext);
  return { stompClient, receivedata, resetData, sendDataToServer,url };
};
