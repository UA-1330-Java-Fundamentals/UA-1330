package com.softserve.edu.homework_15;

class FirstThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First thread is running: " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second thread is running: " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThirdThread extends Thread {
    private Thread thread1, thread2;

    public ThirdThread(Thread t1, Thread t2) {
        this.thread1 = t1;
        this.thread2 = t2;
    }

    public void run() {
        try {
            thread1.join();
            thread2.join(); // Ensure both threads finish before starting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Third thread is running: " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Deadlock {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    static class ThreadA extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread A locked lock1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread A locked lock2");
                }
            }
        }
    }

    static class ThreadB extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread B locked lock2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Thread B locked lock1");
                }
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ThreadThree t3 = new ThreadThree();
        t3.start(); // Start third thread after second thread completes
    }
}

class ThreadThree extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadOne extends Thread {
    public void run() {
        ThreadTwo t2 = new ThreadTwo();
        t2.start(); // Start second thread
    }
}


public class MessageThreads {
    public static void main(String[] args) {
        // **Part 1: Ensure third thread starts after two threads finish**
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        ThirdThread t3 = new ThirdThread(t1, t2);

        t1.start();
        t2.start();
        t3.start(); // t3 will wait for t1 and t2 to finish before running

        // **Part 2: Cause a deadlock**
        Deadlock.ThreadA deadlockThreadA = new Deadlock.ThreadA();
        Deadlock.ThreadB deadlockThreadB = new Deadlock.ThreadB();
        deadlockThreadA.start();
        deadlockThreadB.start();

        // **Part 3: Start "Thread One" which then starts "Thread Two" and "Thread Three"**
        ThreadOne tOne = new ThreadOne();
        tOne.start();
    }
}
