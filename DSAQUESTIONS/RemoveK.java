package DSAQUESTIONS;

import java.util.Arrays;
import java.util.Scanner;
// Avinash and the Spice Balance Sorting Sliding Window Min/Max Avinash is preparing a special dish using N spices.Each spice has an intensity value.Avinash wants the dish to be perfectly balanced,meaning the difference between the strongest and weakest spice is minimized.

// However,avinash can remove at most K spices.

// Task Find the minimum possible difference between max and min after removing at most K elements.

// Input T
// N K

// A1 A2 A3 ... AN

// T-> Test cases
// N K  -> N - Size fo array, K is element to remove
// An -> Input Array of size N
// Output
// minimum_difference

// Input
// 1
// 6 3
// 10 1 2 7 5 8
// Expected Output
// 3
public class RemoveK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int windowSize = n - k;
            if (windowSize <= 1) {
                System.out.println(0);
                continue;
            }
            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i <= n - windowSize; i++) {
                int currDiff = arr[i + windowSize - 1] - arr[i];
                if (currDiff < minDiff)
                    minDiff = currDiff;
            }
            System.out.println(minDiff);
        }
        sc.close();
    }
}
