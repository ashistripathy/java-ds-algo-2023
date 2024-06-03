package function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        //Example of string length
        Function<String,Integer> strLength = (str) -> str.length();
        int length = strLength.apply("Hello, World");
        System.out.println("Length of the String is "+length);

        //Example of function.identity()
        Function<Integer,Integer> identityFunction = Function.identity();
        Integer result = identityFunction.apply(42);
        System.out.println(result);
    }
}
