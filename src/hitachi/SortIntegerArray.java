package hitachi;

import java.util.Arrays;

public class SortIntegerArray {
    public static void main(String[] args) {
        int [] numbers = {7,3,9,1,5};

        int [] sortedNumbers = Arrays.stream(numbers)
                .sorted()
                .toArray();
        System.out.println("Original Array : "+Arrays.toString(numbers));
        System.out.println("Sorted Array : "+Arrays.toString(sortedNumbers));
    }
}
