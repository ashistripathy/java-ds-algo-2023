package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfEvenNumber {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,1,2,3);

        int sum = numbers.stream().filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);

        int sum1 = numbers.stream().filter(x -> x % 3 == 0).mapToInt(x->x).sum();
        System.out.println(sum1);

        numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((x,y)->{
                    System.out.println("number " + x + " occurence "+ y);
                });
        Integer[] arr = {1, 2, 3, 4, 5, 1, 3, 5, 7};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> duplicates = list.stream()
                .filter(i -> list.stream().filter(j -> j.equals(i)).count() > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Duplicates: " + duplicates);
    }
}
