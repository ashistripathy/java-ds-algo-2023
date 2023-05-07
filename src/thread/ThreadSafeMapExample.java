package thread;

import java.util.concurrent.ConcurrentSkipListMap;

public class ThreadSafeMapExample {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();

        map.put("Alice", 22);
        map.put("Ashis", 32);
        map.put("Charlie",35);

        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Bob's age: " + map.get("Ashis"));
        System.out.println("Charlie's age: " + map.get("Charlie"));

        // Modify values in the map
        map.put("Alice", 26);
        map.put("Bob", 31);
        map.put("Charlie", 36);

        // Read values from the map again
        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Bob's age: " + map.get("Ashis"));
        System.out.println("Charlie's age: " + map.get("Charlie"));

        /*Other Multithreading Concepts available
        * Phaser
        * Exchanger
        * Future
        * Executor
        * ConcurrentLinkedQueue Done
        * CopyOnWriteArrayList Done
        * ForkJoin Framework */


    }
}
