package thread;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        //create a concurrent linked queue
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        //add elements into the queue
        queue.offer("Python");
        queue.offer("Java");
        queue.offer("C++");
        queue.offer("C");

        //remove the first element from the queue
        String element = queue.poll();

        //print the removed element
        System.out.println(element);

        //print the queue post element removal
        System.out.println(queue);

        //get the first element from the queue without removing it
        String firstElement = queue.peek();
        System.out.println(firstElement);

        //print the queue again
        System.out.println(queue);
    }
}
