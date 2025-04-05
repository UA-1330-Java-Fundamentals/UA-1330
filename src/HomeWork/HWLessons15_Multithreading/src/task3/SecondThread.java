package task3;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (NumberThread.monitor) {
                System.out.println("Thread number two");
            }
        }
    }
}
