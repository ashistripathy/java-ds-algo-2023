package test.array;

import java.util.Arrays;

public class FindSingleElement {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9};
        int findSingleElement = findSingleElement(arr);
        System.out.println(findSingleElement);
    }
    private static int findSingleElement(int [] arr){
        return Arrays.stream(arr)
                .reduce(0,(a,b) -> a^b );
    }
}
