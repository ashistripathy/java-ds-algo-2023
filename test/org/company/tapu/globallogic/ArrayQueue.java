package org.company.tapu.globallogic;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
            System.out.println("Enqueued element: " + element);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            int dequeuedElement = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Dequeued element: " + dequeuedElement);
            return dequeuedElement;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            System.out.println("Front element: " + queue[front]);
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.enqueue(6); // This should output "Queue is full."

        queue.peek(); // This should output "Front element: 1."

        queue.dequeue(); // This should output "Dequeued element: 1."

        queue.peek(); // This should output "Front element: 2."
    }
}

