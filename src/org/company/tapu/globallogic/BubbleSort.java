package org.company.tapu.globallogic;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,7,9,8,2,1};
        bubbleSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n-1; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
