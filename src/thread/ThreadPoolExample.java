package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String [] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //submitting 10 tasks to the thread pool
        for(int i=0; i<10; i++){
            executorService.execute(new Task("Task "+i));
        }
        executorService.shutdown();
    }
}
