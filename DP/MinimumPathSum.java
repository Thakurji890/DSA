package DP;

import java.util.Arrays;

public class MinimumPathSum {

    // button and right only movement
    public static void main(String[] args) {
        int[][] path = {
                { 5, 9, 6 },
                { 11, 5, 2 }
        };

        System.out.println(recursion(path, path.length - 1, path[0].length - 1));

        System.out.println(memoized(path, path.length - 1, path[0].length - 1));
    }

    public static int recursion(int[][] path, int i, int j) {
        if (i == 0 && j == 0)
            return path[0][0];

        if (i < 0 || j < 0)
            return (int) 1e9;

        int upPath = path[i][j] + recursion(path, i - 1, j);
        int leftPath = path[i][j] + recursion(path, i, j - 1);

        return Math.min(leftPath, upPath);
    }

    public static int memoized(int[][] path, int i, int j) {
        int[][] dp = new int[i + 1][j + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(path, i, j, dp);
    }

    public static int helper(int[][] path, int i, int j, int[][] dp) {
        if (i == 0 && j == 0)
            return path[0][0];

        if (i < 0 || j < 0)
            return (int) 1e9;
        if (dp[i][j] != -1)
            return dp[i][j];

        int upPath = path[i][j] + recursion(path, i - 1, j);
        int leftPath = path[i][j] + recursion(path, i, j - 1);

        return dp[i][j] = Math.min(leftPath, upPath);
    }

}
