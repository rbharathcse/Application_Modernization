package org.example;

class MyThread4 extends Thread {

    public static int n = 1000;
    public synchronized void calculate(){
        n++;
        System.out.println(n);
        System.out.println(Thread.currentThread().getName());

    }
    @Override
    public  void run() {

        System.out.println(
                Thread.currentThread().getName()
                        + " is running");

        calculate();


    }
}

public class Synchronization {

    public static void main(String[] args) {
        MyThread4 mt = new MyThread4();
        MyThread4 mt1 = new MyThread4();
        mt.start();
        mt1.start();


    }
}

