package org.example;
class MyThread1 extends Thread {

    private int sleepTime;

    public MyThread1(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {

        try {
            System.out.println("Running : " +
                    Thread.currentThread().getName());

            Thread.sleep(sleepTime);

            System.out.println("Completed : " +
                    Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Cust_Names_Threads {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1(12000);
        MyThread1 t2 = new MyThread1(1000);
        MyThread1 t3 = new MyThread1(0);

        t1.setName("Morning");
        t2.setName("Afternoon");
        t3.setName("Evening");

        t1.start();
        t2.start();
        t3.start();
    }

    }
