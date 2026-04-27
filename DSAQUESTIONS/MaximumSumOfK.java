package DSAQUESTIONS;

import java.util.Scanner;

public class MaximumSumOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Array Inputs : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("K value : ");
        int k = sc.nextInt();

        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k)
            return 0;
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        int maxVal = currSum;

        for (int i = k; i < arr.length; i++) {
            currSum = arr[i] + arr[i - k];
            maxVal = Math.max(maxVal, currSum);
        }
        return maxVal;
    }
}
