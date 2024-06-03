package hackerrank.morganstanly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EffiecientJanitor {
    public static void main(String[] args) {

        // Creating a list of bag weights
        List<Float> weight = new ArrayList<>(Arrays.asList(1.01f, 1.99f, 2.5f, 1.5f, 1.01f));

        // Call the efficientJanitor function to get the number of trips
        int numTrips = efficientJanitor(weight);

        // Displaying the number of trips required
        System.out.println("Number of trips required: " + numTrips);
    }
    public static int efficientJanitor(List<Float> weight) {
        // Sort the list of bag weights in ascending order
        Collections.sort(weight);

        int numTrips = 0;
        int left = 0;
        int right = weight.size() - 1;

        // Iterate over the list of bag weights using two pointers
        while (left <= right) {
            float sum = weight.get(right);

            // Include bags with weight <= 1.99 pounds in the current trip
            while (left <= right && sum + weight.get(left) <= 3.00) {
                sum += weight.get(left);
                left++;
            }

            // Include the heaviest bag in the current trip
            right--;

            // Increment the number of trips
            numTrips++;
        }

        return numTrips;
    }

}
