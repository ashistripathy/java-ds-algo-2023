package array;

public class ArrayTargetDemo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6};
        int target = 10;

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j <= target; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }

        System.out.println("Number of ways to reach target " + target + " from the array {2, 3, 5, 6} is: " + dp[target]);
    }
}

