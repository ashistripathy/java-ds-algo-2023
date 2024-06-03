package valuelabs;

public class SmallestNum {
    private static int findSmallestNum(int n){
        if(n <= 0){
            return 0;
        }
        int sum = 0;
        int num = 0;

        while (sum < n){
            num++;
            sum = getDigitSum(num);
        }
        return num;
    }
    private static int getDigitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int smallestNumber = findSmallestNum(n);
        System.out.println(n + "is "+ smallestNumber);
    }
}
