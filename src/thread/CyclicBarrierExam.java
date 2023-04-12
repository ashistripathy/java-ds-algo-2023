package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExam {
    private static final int NUM_THREAD = 4;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUM_THREAD,()->{
            System.out.println("All Threads reach the barrier!");
        });

        for (int i = 1; i <= NUM_THREAD; i++){
            new Thread(()->{
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting at the barrier");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread " + Thread.currentThread().getName() + " has passed the barrier");
            },"Thread "+i).start();
        }
    }
}
