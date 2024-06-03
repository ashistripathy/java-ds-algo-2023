package org.company.tapu.globallogic;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int [] arr = {7,3,5,9,13};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0;i< arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondLargest && arr[i] != largest ) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest number is : "+ secondLargest);

        //Using Java 8 stream API operations
        int [] array = {10,20,30,50,40};

        Integer secLargest = Arrays.stream(array)
                .boxed()
                .sorted()
                .distinct()
                .skip(array.length - 2)
                .findFirst()
                .orElse(-1);

        System.out.println(secLargest);
    }
}
