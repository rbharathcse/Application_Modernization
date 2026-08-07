package com.bank.Order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TransferService transferService =
                context.getBean("TransferService", TransferService.class);

        transferService.transfer(5000);
    }
}