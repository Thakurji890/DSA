package DSAQUESTIONS;

import java.util.Scanner;

public class maximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(kadane(arr));
        }
    }

    public static long kadane(int[] arr) {
        long totalSum = Integer.MIN_VALUE;
        long currSum = 0;

        for (int val : arr) {
            currSum += val;
            if (currSum > totalSum)
                totalSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }
        return totalSum;
    }

}
