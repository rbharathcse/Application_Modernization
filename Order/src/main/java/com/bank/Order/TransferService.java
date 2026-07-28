package com.bank.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {
	
	private PaymentService paymentService;
	@Autowired
     public TransferService(PaymentService paymentService) {
		this.paymentService = paymentService;

	}
     public void transfer(int amt) {
    	 paymentService.payment(" Amount : "+amt);
     }
     
     
}
