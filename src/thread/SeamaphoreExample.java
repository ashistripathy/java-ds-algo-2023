package thread;

import java.util.concurrent.Semaphore;

public class SeamaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Thread worker1 = new Thread(()->{
            try {
                semaphore.acquire();
                System.out.println("Worker 1 acquired permit");
                Thread.sleep(1000);
                System.out.println("Worker 1 releasing permit");
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread worker2 = new Thread(()->{
            try {
                semaphore.acquire();
                System.out.println("Worker 2 acquired permit");
                Thread.sleep(1000);
                System.out.println("Worker 2 releasing permit");
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
