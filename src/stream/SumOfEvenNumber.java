package stream;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumber {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        int sum = numbers.stream().filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);
    }
}
