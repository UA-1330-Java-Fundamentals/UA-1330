/*
Output text «I study Java» 10 times with the intervals of one second
(Thread.sleep( 1000 ) ; ).
*/

package HomeWorkFromPDF.HomeWorkFromPDF15;

public class PracticalTask1 implements Runnable {
    public static void main(String[] args) {
        PracticalTask1 task = new PracticalTask1();
        Thread thread = new Thread(task);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("I study Java");

            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
