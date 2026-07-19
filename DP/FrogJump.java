package DP;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 10, };

        System.out.println(minmalCostUsingRec(arr, arr.length - 1));
        System.out.println(memoization(arr.length, arr));
        System.out.println(tabulation(arr.length, arr));
        System.out.println(moreOptimalSolution(arr.length, arr));
    }

    // First Solution
    public static int minmalCostUsingRec(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        int left = minmalCostUsingRec(arr, n - 1) + Math.abs(arr[n] - arr[n - 1]);
        int right = Integer.MAX_VALUE;
        if (n > 1) {
            right = minmalCostUsingRec(arr, n - 2) + Math.abs(arr[n] - arr[n - 2]);
        }

        return Math.min(left, right);
    }

    // Second Solution
    public static int memoization(int n, int[] arr) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n - 1, dp, arr);
    }

    private static int helper(int n, int[] dp, int[] arr) {
        if (n == 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];

        int left = helper(n - 1, dp, arr)
                + Math.abs(arr[n] - arr[n - 1]);

        int right = Integer.MAX_VALUE;
        if (n > 1)
            right = helper(n - 2, dp, arr)
                    + Math.abs(arr[n] - arr[n - 2]);

        return dp[n] = Math.min(left, right);
    }

    // Third Solution
    public static int tabulation(int n, int[] arr) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int first = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int second = Integer.MAX_VALUE;
            if (i > 1) {
                second = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp[i] = Math.min(first, second);
        }
        return dp[n - 1];
    }

    // Fourth Solution
    public static int moreOptimalSolution(int n, int[] arr) {
        int prev = 0, prev2 = 0;
        for (int i = 1; i < n; i++) {
            int first = prev + Math.abs(arr[i] - arr[i - 1]);

            int second = Integer.MAX_VALUE;
            if (i > 1) {
                second = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }
            int curr = Math.min(first, second);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
