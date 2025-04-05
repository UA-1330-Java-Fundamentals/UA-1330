package task3;

public class ThirdThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (NumberThread.monitor) {
                System.out.println("Thread number three");
            }
        }
    }
}
