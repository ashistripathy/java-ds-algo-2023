package org.company.tapu.morganstanley;
import java.util.ArrayList;
import java.util.List;
public class OutputCandidateArray {
    public static void main(String [] args){
        int [] arr = {10,7,2,1,8,3,1,9};
        List<Integer> output = findElements(arr);
        System.out.println(output);
    }

    private static List<Integer> findElements(int[] arr) {
        List<Integer> output = new ArrayList<>();
        int maxSoFar = arr[arr.length-1];
        int n = arr.length-2;

        for(int i=n; i >= 0; i--){
            if(arr[i] > maxSoFar){
                output.add(arr[i]);
            }
            maxSoFar = Math.max(maxSoFar,arr[i]);
        }
        return output;
    }
}
