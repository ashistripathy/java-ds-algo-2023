package thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private Map<String, Integer> map = new HashMap<>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    //synchronized get operation using writelock
    public void put(String key,Integer value){
        lock.writeLock().lock();//acquire write lock
        try{
            map.put(key, value);
        }finally {
            lock.writeLock().unlock();
        }
    }
    //synchronized get operation using readlock
    public Integer get(String key){
        lock.readLock().lock();//acquire read lock
        try{
            return map.get(key);
        }finally {
            lock.readLock().unlock();
        }
    }
    public void printMap(){
        lock.readLock().lock();//acquire read lock
        try{
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }finally {
            lock.readLock().unlock();
        }
    }
    public static void main(String[] args) {
        ReadWriteLockExample readWriteLockExample = new ReadWriteLockExample();
        readWriteLockExample.put("Ashis",33);
        readWriteLockExample.put("Rajesh",34);
        readWriteLockExample.put("Tapan",33);
        readWriteLockExample.put("Bika",31);
        readWriteLockExample.put("Allha",34);
        readWriteLockExample.put("Sachin",35);

        //printMap
        readWriteLockExample.printMap();;
    }
}
