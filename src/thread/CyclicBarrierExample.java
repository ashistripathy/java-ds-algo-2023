package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    private static final int THREAD_COUNT = 5;
    public static void main(String[] args) {
        // Initialize a CyclicBarrier with THREAD_COUNT parties
        CyclicBarrier cyclicBarrier = new CyclicBarrier(THREAD_COUNT,()->{
            System.out.println("All threads have reached the barrier");
        });
        for(int i = 0; i < THREAD_COUNT; i++){
            new Thread(()->{
                System.out.println("Thread " + Thread.currentThread().getId() + " is waiting at the barrier");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread " + Thread.currentThread().getId() + " has passed the barrier");
            }).start();
        }
    }
}
