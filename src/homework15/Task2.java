package homework15;
/*
Cause a deadlock. Organize the expectations of ending a thread in main(), and make
the end of the method main() in this thread.
 */

public class Task2 {
final static Object first = new Object();
final static Object second = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = new Thread() {
            public void run () {
                synchronized (second) {
                    try{Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (first) {
                        System.out.println("Main is finished");
                    }
                }
            }
        };
        mainThread.start();
        t1.start();   }


    static Thread t1 = new Thread() {
        public void run(){
            synchronized (first){
                try{Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (second){
                    System.out.println("Thread finished");
                }
            }
            }
        };


    }





