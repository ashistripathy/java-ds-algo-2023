package org.company.tapu;

import java.util.Arrays;
import java.util.HashSet;

public class SynechronTest {
    public static void main(String[] args) {
        int [] arr = {10,7,8,1,8,7,6};
        int firstDuplicate = -1;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    firstDuplicate = arr[i];
                    break;
                }
            }
            if(firstDuplicate != -1){
                break;
            }
        }
        if(firstDuplicate != -1){
            System.out.println("First duplicate is "+firstDuplicate);
        }else{
            System.out.println("There is no duplicates in array ");
        }
    }
}
