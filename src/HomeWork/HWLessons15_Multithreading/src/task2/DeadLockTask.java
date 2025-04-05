package task2;

public class DeadLockTask {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        Thread worker = new Thread(() -> {
            System.out.println("Worker started, not waiting to main to finish");
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker finished");
        });
        worker.start();
        System.out.println("Main thread waiting to worker to finish");
        worker.join();
        System.out.println("Main finished");
    }
}
