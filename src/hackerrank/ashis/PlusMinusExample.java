package hackerrank.ashis;

import java.util.Arrays;
import java.util.List;

public class PlusMinusExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,0,-1,-1);
        plusMinus(list);
    }
    private static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount  = 0;
        int n = arr.size();

        for(int i = 0; i < n ; i++){
            int num = arr.get(i);

            if(num > 0){
                positiveCount++;
            }else if(num < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        double postiveRatio = positiveCount/n;
        double negativeratio = negativeCount/n;
        double zeroRatio = zeroCount/n;

        System.out.printf("%.6f\n",postiveRatio);
        System.out.printf("%.6f\n",negativeratio);
        System.out.printf("%.6f\n",zeroRatio);
    }
}
