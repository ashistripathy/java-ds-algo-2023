package hackerrank.morganstanly;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class calculateMinimumCost {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6);
        int totalCost = calculateMinimumCost(num);
        System.out.println("Minimum total cost: " + totalCost);
    }
    public static int calculateMinimumCost(List<Integer> num) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(num);
        int totalCost = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            totalCost += sum;
            pq.offer(sum);
        }
        return totalCost;
    }
}
