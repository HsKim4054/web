package com.kosta.deal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kosta.deal.entity.Sale;
import com.kosta.deal.service.PayService;
import com.kosta.deal.service.PaymentService;
import com.kosta.deal.service.SaleService;

@RestController
public class PayController {
	
	@Autowired
	private PayService payService;
	
	@Autowired
	private SaleService saleService;
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/gpay/{num}")
	public ResponseEntity<Sale> Gpay(@PathVariable Integer num){
		try {
			Sale sale=saleService.saleDetail(num);
			return new ResponseEntity<Sale>(sale,HttpStatus.OK);

		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Sale>(HttpStatus.BAD_REQUEST);
		}
	}
	
//	@PostMapping("/pay")
//	public ResponseEntity<String> pay(@RequestBody Map<String,Object> param) {
//		try {
//			//pay 생성
//			Pay pay = new Pay();
//			pay.setSaletitle((String)param.get("saletitle"));
//			pay.setAmount(Integer.parseInt(String.valueOf(param.get("amount"))));
//			pay.setBuyeremail((String)param.get("buyeremail"));
//			pay.setImp_uid((String)param.get("imp_uid"));
//			
//			//token
//			String token = paymentService.getToken();
//			System.out.println("토큰 : " + token);
//			//결제 완료 금액
//			int amount = paymentService.paymentInfo(pay.getImp_uid(), token);
//			if(amount != pay.getAmount()) {
//				paymentService.payMentCancle(token, pay.getImp_uid(), amount, "결제 금액 오류");
//	            return new ResponseEntity<String>("결제 금액 오류, 결제 취소", HttpStatus.BAD_REQUEST);
//			}
//			payService.insertPay(pay);
//			return new ResponseEntity<String>("결제가 완료되었습니다.", HttpStatus.OK);
//		} catch(Exception e) {
//			e.printStackTrace();
//			try {
//				String token = paymentService.getToken();
//				Pay pay = new Pay();
//				pay.setSaletitle((String)param.get("saletitle"));
//				pay.setAmount(Integer.parseInt(String.valueOf(param.get("amount"))));
//				pay.setBuyeremail((String)param.get("buyeremail"));
//				pay.setImp_uid((String)param.get("imp_uid"));
//				int amount = paymentService.paymentInfo(pay.getImp_uid(), token);
//				paymentService.payMentCancle(token, pay.getImp_uid(), amount, "어드민 계좌 입금 오류");
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
//			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
//		}
//	}
	
}
