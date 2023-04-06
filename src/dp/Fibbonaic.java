package dp;

public class Fibbonaic {
    public static void main(String[] args) {
        int n = 25;
        int result = fibonacci(n);
        System.out.println("The "+n+"th number in the fibonacci sequence is "+result);
    }
    public static int fibonacci(int n){
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
