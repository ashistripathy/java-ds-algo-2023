package queue;

import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> items;

    public Queue() {
        this.items = new LinkedList<>();
    }

    // Add an item to the back of the queue
    public void enqueue(T item) {
        this.items.addLast(item);
    }

    // Remove and return the item at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return this.items.removeFirst();
    }

    // Get the item at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return this.items.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return this.items.size();
    }
}

