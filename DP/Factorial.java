package DP;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factRec(n));
        System.out.println(memoization(n));
        System.out.println(tabulation(n));
        System.out.println(optimalSolution(n));

    }

    public static int factRec(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factRec(n - 1);
    }

    public static int memoization(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return helper(n, dp);
    }

    private static int helper(int n, int[] dp) {
        if (n == 0 || n == 1)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = n * helper(n - 1, dp);
    }

    public static int tabulation(int n) {
        if (n == 0 || n == 1)
            return 1;
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }
        return dp[n];

    }

    public static int optimalSolution(int n) {
        if (n == 0 || n == 1)
            return 1;

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
