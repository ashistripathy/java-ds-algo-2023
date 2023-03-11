package coforge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OccurenceCheckWithDistinct {
    public static void main(String [] args){
        /*problem statement :
         * Given an integer array nums, return true if any value appears at least twice in the array,
         * and return false if every element is distinct.*/

        /*input : 1,2,3,4,4,5,6,7,8*/

        /*output : 1-false
        * 2: false
        * 3: false
        * 4: true*/

        //step 1 : create a list of integer using Arrays.list
       int [] nums = {1,2,3,4,5,6,7,7,8};
       boolean flag = containsDuplicate(nums);

       if(flag){
           System.out.println("Duplicates exist");
       }else{
           System.out.println("NO duplicates exist");
       }

    }
    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
