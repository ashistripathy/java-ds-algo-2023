package thread;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ThreadTest implements Runnable{
    @Override
    public void run() {
        System.out.println("running");
    }
    public static void main(String [] args){
        char [] a = new char[10];

        for(int i =0; i < 10;++i){
            a[i] = '1';
            System.out.println(a[i] + "");
            i++;
        }
        BiFunction<String,String,Boolean> compareString = (x,y) ->
                x.equals(y);
        System.out.println(compareString.apply("java8","java8"));

        IntStream.of(1,1,3,3,7,6,7)
                .distinct()
                .parallel()
                .map(i->i*2)
                .sequential()
                .forEach(System.out::println);
    }
}
