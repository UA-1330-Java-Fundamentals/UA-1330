package homework15;
/*
Create a thread «one», which would start the thread «two», which has to output its
number («Thread number two») 3 times and create thread «three», which would to
output message «Thread number three» 5 times.
 */
public class Task3 {
    public static void main(String[] args) {
        var one = new Thread(() -> {
            var two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                var three = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                });
                three.start();
            });
         two.start();
        });
        one.start();
    }
}
