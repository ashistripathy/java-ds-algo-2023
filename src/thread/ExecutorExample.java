package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        //using execute() method
        executor.execute(()->{
            System.out.println("Task executed asynchronously");
        });

        // Using submit() method
        Future<Integer> future = executor.submit(() -> {
            System.out.println("Task executed asynchronously and returned a result");
            return 42;
        });

        // Wait for the task to complete and get the result
        try{
            Integer result = (Integer) future.get();
            System.out.println("Result of the task "+result);
        }catch (Exception e){
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
