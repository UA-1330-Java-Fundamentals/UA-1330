package task3;

public class FirstThread implements Runnable {
    @Override
    public void run() {
        synchronized (NumberThread.monitor) {
        }
    }
}
