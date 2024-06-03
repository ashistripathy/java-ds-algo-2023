package test.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    private static Set<Integer> findDuplicates(int [] arr){
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                duplicates.add(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,4,5,4,5,6,7,8,9,10,10};
        Set<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }
}
