package org.company.tapu.globallogic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearchUsingStream {
    public static void main(String[] args) {
        //Write a Java program to implement binary search on a sorted array using stream api
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int result = binarySearch(list,target);

        if(result == -1){
            System.out.println("target not found : ");
        }else{
            System.out.println("Target found at index " + result + ".");
        }

    }
    public static int binarySearch(List<Integer> list, int target){
        int left = 0;
        int right = list.size()-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(list.get(mid) == target){
                return mid;
            } else if (list.get(mid) < target) {
                left = mid+1;
            }else{
                right = right -1;
            }
        }
        return -1;
    }
}
