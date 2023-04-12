package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        //creating a blocking queue with a capacity of 5
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(()->{
            try{
                for(int i = 1; i <= 10; i++){
                    System.out.println("Producing Element "+ i);
                    queue.put(i);//adding an element to the queue
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        //creating a consumer thread
        Thread consumer = new Thread(()->{
            try{
               for(int i = 1; i <= 10; i++){
                   Integer element = queue.take();//removing an element from the queue
                   System.out.println("Consuming element "+element);
               }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        //starting producer and consumer threads
        producer.start();
        consumer.start();

        //waiting for the threads to finish
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
