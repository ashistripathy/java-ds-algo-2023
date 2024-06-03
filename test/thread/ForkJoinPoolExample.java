package thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolExample extends RecursiveTask {
    private int [] array;
    private int start;
    private int end;

    public ForkJoinPoolExample(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinPoolExample task = new ForkJoinPoolExample(array, 0, array.length);
        int result = (int) pool.invoke(task);
        System.out.println("Sum: " + result);
    }

    @Override
    protected Integer compute() {
        if(end - start <= 2){
            int sum = 0;
            for(int i = start; i < end; i++){
                sum += array[i];
            }
            return sum;
        }else{
            int mid = start + (end - start)/2;
            ForkJoinPoolExample left = new ForkJoinPoolExample(array, start, mid);
            ForkJoinPoolExample right = new ForkJoinPoolExample(array,mid,end);
            left.fork();
            int rightResult = right.compute();
            int leftResult = (int) left.join();
            return leftResult+rightResult;
        }
    }
}
