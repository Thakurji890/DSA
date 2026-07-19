package DP;

import java.util.Arrays;

public class Fibbonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(recFibbo(i) + " ");
        }
        System.out.println();

        dpFibbo(5);
    }

    public static int recFibbo(int n) {
        if (n <= 1) {
            return n;
        }
        return recFibbo(n - 1) + recFibbo(n - 2);
    }

    public static void dpFibbo(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(dpfibboRec(n, dp));

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        for (int i : dp) {
            System.out.print(i + " ");
        }

    }

    public static int dpfibboRec(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = dpfibboRec(n - 1, dp) + dpfibboRec(n - 2, dp);
    }
}
