package com.bank.Order;

public class CreditCard implements PaymentService{

	@Override
	public void payment(String msg) {
	 System.out.println("Credit Card Payment"+msg);
		
	}

	
}
