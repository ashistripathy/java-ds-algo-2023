package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionExample {
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private int count;

    public void increment() throws InterruptedException{
        lock.lock();
        try{
            while (count == 10){
                condition.await();
            }
            count++;
            System.out.println("Count is now "+count);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void decrement() throws InterruptedException{
        lock.lock();
        try{
            while (count == 0){
                condition.await();
            }
            count--;
            System.out.println("Count is now "+count);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockConditionExample lockConditionExample = new LockConditionExample();

        Thread incrementThread = new Thread(()->{
            try{
                while (true){
                    lockConditionExample.increment();
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        });

        Thread decrementThread = new Thread(()->{
            try{
                while(true){
                    lockConditionExample.decrement();
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        incrementThread.start();
        decrementThread.start();
    }
}
