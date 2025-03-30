/*
Create a thread «one», which would start the thread «two», which has to output its
number («Thread number two») 3 times and create thread «three», which would to
output message «Thread number three» 5 times.
*/

package HomeWorkFromPDF.HomeWorkFromPDF15;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException {
        Thread two = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }

            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            three.start();
            try {
                three.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread one = new Thread(() -> {
            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        one.start();
    }
}
