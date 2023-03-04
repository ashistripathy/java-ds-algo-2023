package queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.size()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false
        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.isEmpty()); // Output: true
    }
}

