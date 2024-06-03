package sorting;

public class BubbleSort {
    public static void main(String [] args){
        int[] arr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap arr[j] & arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
