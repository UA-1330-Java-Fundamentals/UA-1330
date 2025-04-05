package task1;

public class RunThirdMessage implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Messages.monitor) {
                System.out.println("Third message");
            }
        }
        System.out.println("3 Done");
    }
}
