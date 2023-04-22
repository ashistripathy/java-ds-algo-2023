package hitachi;

import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        //bubbleSort(arr);
        bubbleSortUsingStream(arr);
        printArray(arr);
    }
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int [] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void bubbleSortUsingStream(int [] arr){
        IntStream.range(0, arr.length)
                .flatMap(i -> IntStream.range(0, arr.length-i-1))
                .filter(j -> arr[j] > arr[j+1])
                .map(j -> {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    return j;
                }).count();
    }
}
