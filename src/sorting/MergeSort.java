package sorting;

public class MergeSort {
    public static void main(String [] args){
        int arr [] = {6,3,9,5,2,9};
        int n = arr.length;

        divide(arr,0,n-1);

        for(int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void divide(int [] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {
        int mergeed [] = new int[ei - si +1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <=mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                mergeed[x++]=arr[idx1++];
            }else{
                mergeed[x++]=arr[idx2++];
            }
        }
        while(idx1 <= mid){
            mergeed[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            mergeed[x++] = arr[idx2++];
        }
        for(int i =0, j = si ; i < mergeed.length; i++,j++){
            arr[j] = mergeed[i];
        }
    }
}
