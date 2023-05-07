package stream;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // sum of numbers
        BiFunction<Integer,Integer,Integer> sum = (num1,num2) -> num1+num2;
        Integer result = sum.apply(6,7);

        System.out.println(result);

        //concatenates string
        BiFunction<String,String,String> concatenate = (str1,str2) -> str1 + str2;
        String output = concatenate.apply("Ashis"," Tripathy");
        System.out.println(output);
    }
}
