package adi.walmart;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        permute(str, 0, n-1);
    }
    public static void permute(String str, int left, int right){
        if(left == right)
        {
            System.out.println(str);
        }else{
            for(int i = left; i <= right; i++){
                str = swap(str, left, i);
                permute(str, left+1, right);
                str = swap(str, left, i);
            }
        }
    }
    public static String swap(String str, int i, int j){
        char [] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
