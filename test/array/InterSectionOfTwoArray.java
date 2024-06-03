package array;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOfTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,3,4,5};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i:arr1){
            set1.add(i);
        }
        for(int i:arr2){
            set2.add(i);
        }
        set1.retainAll(set2);
        System.out.println("Common Elements are : "+set1);
    }
}
