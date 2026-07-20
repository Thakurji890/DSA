package DP;

import java.util.Arrays;

public class FollowUpFrogJump {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 10, };

        System.out.println(recursive(arr, arr.length - 1, 2));
        System.out.println(memoized(arr, arr.length - 1, 2));
        System.out.println(tabulation(arr, arr.length - 1, 2));
    }

    public static int recursive(int[] arr, int n, int k) {
        if (n == 0) {
            return 0;
        }

        int minimumStep = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jump = recursive(arr, n - i, k);
                minimumStep = Math.min(minimumStep, jump) + Math.abs(arr[n] - arr[n - i]);
            }
        }

        return minimumStep;
    }

    public static int memoized(int[] arr, int n, int k) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return helper(arr, n, k, dp);
    }

    private static int helper(int[] arr, int n, int k, int[] dp) {
        if (n == 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];

        int minimumStep = Integer.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jumpCost = helper(arr, n - i, k, dp)
                        + Math.abs(arr[n] - arr[n - i]);
                minimumStep = Math.min(minimumStep, jumpCost);
            }
        }
        return dp[n] = minimumStep;
    }

    public static int tabulation(int[] arr, int n, int k) {
        int[] dp = new int[n + 1];

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int minimumStep = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    minimumStep = Math.min(minimumStep, jump);
                }
            }
            dp[i] = minimumStep;
        }
        return dp[n];
    }

}
