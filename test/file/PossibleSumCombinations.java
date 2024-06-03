package file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleSumCombinations {
    public static void main(String [] args){
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 9};
        List<List<Integer>> combinations = findCombinations(nums, 10);
        System.out.println(combinations);
    }
    public static List<List<Integer>> findCombinations(int [] nums,int target){
        List<List<Integer>> combinations = new ArrayList<>();
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                combinations.add(Arrays.asList(nums[left],nums[right]));
                left++;
                right--;
            }else if (sum < target){
                left++;
            }else{
                right--;
            }
        }
        return combinations;
    }
}
