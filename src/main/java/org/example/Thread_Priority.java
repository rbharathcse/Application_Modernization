package org.example;

class MyThread3 extends Thread {

    private int sleepTime;

    public MyThread3(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {

        try {
            System.out.println(
                    Thread.currentThread().getName()
                            + " Priority : "
                            + Thread.currentThread().getPriority());

            Thread.sleep(sleepTime);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread_Priority {

    public static void main(String[] args) {

        MyThread3 t1 = new MyThread3(2000);
        MyThread3 t2 = new MyThread3(1000);
        MyThread3 t3 = new MyThread3(0);

        t1.setName("Morning");
        t2.setName("Afternoon");
        t3.setName("Evening");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
