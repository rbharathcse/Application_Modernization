package com.bank.Order;

public class DebitCard implements PaymentService {

	@Override
	public void payment(String msg) {
		System.err.println("Debit Card"+msg);
		
	}

}
