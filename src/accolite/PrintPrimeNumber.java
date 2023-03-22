package accolite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintPrimeNumber {
    public static void main(String [] args){
        //step 1 : create array of integer
        int numbers [] = {2,3,4,5,6,7,8,9,10};

        //step 2 : retrieve prime list in a integer array
        List<Integer> primeNumbers = getPrimeNUmbers(numbers);

        System.out.println(primeNumbers);
    }


    private static List<Integer> getPrimeNUmbers(int[] numbers) {
       //step 1 : pass number array inside stream function and collect boxed list
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        //step 2 : pass isPrime to check the streamed element is prime or not
        return list.stream()
                .filter(PrintPrimeNumber :: isPrime)
                .collect(Collectors.toList());
    }
    public static boolean isPrime(int n){
        //step 1 : check if the no is 1 which is not prime
        if(n <= 1){
            return false;
        }
        //step 2 : check other numbers by looping from it's half
        for (int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
