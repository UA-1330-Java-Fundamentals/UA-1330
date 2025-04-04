package com.softserve.threads.homework2;

public class ApplLock {
    final public  static Object first = new Object();
    final public static Object second = new Object();

    static Thread t1 = new Thread(){
    public void run(){
        synchronized (first){
            try{
                Thread.sleep(10);} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (second){
                System.out.println("Success");
            }
            }
        }
    };

    static Thread t2 = new Thread(){
        public void run(){
            synchronized (second){
                try{
                    Thread.sleep(10);} catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (first){
                    System.out.println("Success");
                }
            }
        }
    };
        public static void main(String[] args) throws InterruptedException {
            System.out.println("Main Thread ID = " + Thread.currentThread().getId());
            t1.start();
            t2.start();

              try{
                Thread.sleep(20);} catch (Exception e) {}
            System.out.println(t1.getState());
            System.out.println(t1.getState());

            Thread.currentThread().interrupt();
            Thread.sleep(20);
            t1.interrupt();
            t2.interrupt();
            System.out.println(t1.getState());
            System.out.println(t1.getState());

        }

}





