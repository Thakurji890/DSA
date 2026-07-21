package DP;

import java.util.Arrays;

// dp on grid / 2d matrix
//  - count paths
//  - count paths with obstacles
//  - minimum path sum
//  - max path sum
//  - triangle 
//  - 2 start points
public class DPGrids {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(totalPathRecursion(m - 1, n - 1));
        System.out.println(memoized(m - 1, n - 1));
        System.out.println(tabulation(m, n));
    }

    // Total unique paths
    // staring from (0,0) to (m -1 , n -1)
    // only move right and down
    public static int totalPathRecursion(int i, int j) {
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i < 0 || j < 0) {
            return 0;
        }

        int upPath = totalPathRecursion(i - 1, j);
        int leftPath = totalPathRecursion(i, j - 1);

        return upPath + leftPath;
    }

    // memoization
    public static int memoized(int i, int j) {
        int[][] dp = new int[i + 1][j + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(i, j, dp);
    }

    public static int helper(int i, int j, int[][] dp) {
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];

        int upPath = helper(i - 1, j, dp);
        int leftPath = helper(i, j - 1, dp);

        return dp[i][j] = upPath + leftPath;
    }

    public static int tabulation(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    dp[0][0] = 1;
                else {
                    int upPath = 0;
                    int leftPath = 0;
                    if (i > 0) {
                        upPath = dp[i - 1][j];
                    }
                    if (j > 0) {
                        leftPath = dp[i][j - 1];
                    }
                    dp[i][j] = leftPath + upPath;
                }
            }
        }
        return dp[m - 1][n - 1];
    }

}
