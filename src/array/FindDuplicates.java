package array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates in the array are: " + duplicates);
    }
}
