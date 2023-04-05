package array;

public class ZeroOneSort {
    public static void main(String ... args){
        int [] arr = {0,1,1,0,1,1,1,0,0,0};
    }
    public static void zeroOneSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Find the first one from the left
            while (arr[left] == 0 && left < right) {
                left++;
            }
            // Find the first zero from the right
            while (arr[right] == 1 && left < right) {
                right--;
            }
            // Swap the zero and one
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

}
