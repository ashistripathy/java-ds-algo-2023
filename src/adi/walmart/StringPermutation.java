package adi.walmart;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        permute(str, 0, n-1);

        /* SECOND APPROACH USING STREAM API*/
        System.out.println("SECOND APPROACH USING STREAM API");
        permutations(str).forEach(System.out::println);
    }
    public static Stream<String> permutations(String str){
        if(str.isEmpty()){
            return Stream.of("");
        }else {
            return IntStream.range(0,str.length())
                    .boxed()
                    .flatMap(i -> permutations(str.substring(0,i) + str.substring(i+1))
                        .map(t -> str.charAt(i)+t));
        }
    }
    public static void permute(String str, int left, int right){
        if(left == right)
        {
            System.out.println(str);
        }else{
            for(int i = left; i <= right; i++){
                str = swap(str, left, i);
                permute(str, left+1, right);
                str = swap(str, left, i);
            }
        }
    }
    public static String swap(String str, int i, int j){
        char [] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
