package array;

import java.util.Scanner;
 
public class gameWithIntegers {
 
    public static String Winner(int n) {
        // If n is divisible by 3, Vanya wins
        if (n % 3 == 0) {
            return "First";
        }
 
        // If n is not divisible by 3, check if it can be made divisible by 3 in 10 moves
        if (n % 3 == 1) {
            return "Second";
        } else if (n % 3 == 2) {
            return "First";
        }
 
        return null; // This line should not be reached, just to satisfy the compiler
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Number of test cases
        int t = scanner.nextInt();
 
        for (int i = 0; i < t; i++) {
            // Input for each test case
            int n = scanner.nextInt();
 
            // Determine the winner for the current test case
            String result = Winner(n);
 
            // Output the result
            System.out.println(result);
        }
 
        scanner.close();
    }
}