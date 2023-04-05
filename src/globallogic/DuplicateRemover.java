package globallogic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DuplicateRemover {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 5, 9, 10, 10};

        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));
    }

    private static int[] removeDuplicates(int[] numbers) {
        return IntStream.of(numbers).distinct().toArray();
    }
}
