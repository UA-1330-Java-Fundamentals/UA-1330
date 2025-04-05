package task1;

public class RunSecondMessage implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Messages.monitor) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                System.out.println("Second message");
            }
        }
        System.out.println("2 Done");
    }
}
