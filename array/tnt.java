package array;
import java.util.Arrays;
import java.util.Scanner;
 
public class tnt {
 
    public static int maxAbsoluteDifference(int n, int[] weights) {
        Arrays.sort(weights); // Sort the weights in ascending order
 
        int maxDiff = 0;
 
        // Try each possible value of k
        for (int k = 1; k <= n; k++) {
            int trucks = n / k; // Calculate the number of trucks
 
            // Calculate the total weights for the first and last trucks
            int totalFirstTruck = 0;
            int totalLastTruck = 0;
 
            for (int i = 0; i < k; i++) {
                totalFirstTruck += weights[i];
                totalLastTruck += weights[n - i - 1];
            }
 
            // Update the maximum absolute difference
            maxDiff = Math.max(maxDiff, Math.abs(totalFirstTruck - totalLastTruck));
        }
 
        return maxDiff;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Number of test cases
        int t = scanner.nextInt();
 
        for (int i = 0; i < t; i++) {
            // Input for each test case
            int n = scanner.nextInt();
            int[] weights = new int[n];
 
            for (int j = 0; j < n; j++) {
                weights[j] = scanner.nextInt();
            }
 
            // Determine the maximum absolute difference for the current test case
            int result = maxAbsoluteDifference(n, weights);
 
            // Output the result
            System.out.println(result);
        }
 
        scanner.close();
    }
}