import React from 'react';
import { IoArrowBackOutline } from "react-icons/io5";
import './img.css';
import './text.css';
import { Input } from 'reactstrap';

function SaleWrite(){
    const text="상세설명을 입력하세요\n 구매날짜, 하자 등 자세하게 작성할수록\n 구매자에게 편리합니다";
   
    return(
        <div className='main' style={{textAlign:'left',overflow:"scroll", height:"742px", overflowX:"hidden"}}> 
        <br/>
         <IoArrowBackOutline size="30" color="14C38E"/>
         <span style={{color:"#14C38E",fontSize:"25px",marginLeft:"80px"}}><b>판매글작성</b></span> 
         <br/><br/>
       
           
           <img src="./cam.png" className='image'></img>
           
       
        <br/> <br/>
        <div style={{marginBottom:"5px", fontSize:"18px"}}>제목</div>
        <Input type="text" placeholder="제목을 입력해주세요" style={{width:"325px",height:"40px" ,borderColor:"lightgray"}}></Input>
        
        <div style={{marginTop:"20px"}}>
            <div style={{marginBottom:"5px", fontSize:"18px"}}>카테고리</div>
            <select style={{width:"150px",height:"40px",textAlign:"center",borderRadius:"5px",float:"left", borderColor:"lightgray"}}>
                <option value="" style={{textAlign:"left"}}>&nbsp;&nbsp;&nbsp;선택</option>   
                <option value="mobile" style={{textAlign:"left"}}>&nbsp;&nbsp;&nbsp;모바일/태블릿</option>
                <option value="pc" style={{textAlign:"left"}}>&nbsp;&nbsp;&nbsp;노트북/PC</option>
                <option value="ticket" style={{textAlign:"left"}}>&nbsp;&nbsp;&nbsp;티켓/쿠폰</option>
                <option value="clothes" style={{textAlign:"left"}}>&nbsp;&nbsp;&nbsp;의류</option>
                <option value="free" style={{textAlign:"left"}}>&nbsp;&nbsp;&nbsp;나눔</option>
                <option value="others" style={{textAlign:"left"}}>&nbsp;&nbsp;&nbsp;기타</option>
            </select> 
            <span className='ggull'style={{float:"right"}}>
                <img src="./ggul2.png"className="right-align"/>
            </span>
        </div>
        <div style={{marginBottom:"60px"}}/>
        <div style={{display:"flex"}}>
            <div>
                <div style={{marginBottom:"5px", fontSize:"18px"}}>가격</div>
                <div><Input type="text" placeholder="10,000원" style={{borderRadius:"5px",height:"40px" ,width:"150px",float:"left"}}></Input></div>
            </div>
            <div>
                <div style={{marginBottom:"5px", fontSize:"18px", marginLeft:"25px"}}>장소</div>
                <div><Input type="text" placeholder="A동 1층" style={{borderRadius:"5px",height:"40px",width:"150px",marginLeft:"25px"}}></Input></div>
            </div>   
        </div>
        
        <br/>
        
        <div>
            <div style={{fontSize:"18px", marginBottom:"10px"}}>상세설명</div>
            <Input cols="40" rows="10" type='textarea'
             style={{width:"325px",height:"300px", resize:"none"}}
             placeholder='
             상세설명을 입력하세요
             구매날짜, 하자 등 자세하게 작성할수록
             구매자에게 편리합니다'></Input>
            
        </div>
        <br/> <p style={{textAlign:"center"}}><input type="submit" value="등록하기" style={{fontWeight:"bold", fontSize:"18px" ,borderRadius:"10px",width:"325px", height:"50px",backgroundColor:'#14C38E',color:"white", borderStyle:"none"}}></input></p>
        
        </div>



    )
}
export default SaleWrite;