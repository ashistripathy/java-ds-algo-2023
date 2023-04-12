package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException{
        int count = 5;
        CountDownLatch latch = new CountDownLatch(count);

        for(int i =1; i<=count; i++){
            final int j = i;
            new Thread(()->{
                System.out.println("task "+ j + " started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("task "+ j + " completed");
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("All task completed");
    }
}
