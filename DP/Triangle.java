package DP;

import java.util.Arrays;

public class Triangle {

    // triangle traversal
    // 1
    // 2 3
    // 3 6 7
    // 8 9 6 10
    // only move buttom or diagonal
    // staring point will fixed and the ending point will vary
    public static void main(String[] args) {
        int[][] arr = {
                { 1 },
                { 2, 3 },
                { 3, 6, 7 },
                { 8, 9, 6, 10 }
        };

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        System.out.println("Recursive : " + recursive(arr, 0, 0));
        endTime = System.nanoTime();
        System.out.println("Executing in : " + (endTime - startTime));

        startTime = System.nanoTime();
        System.out.println("DP Method : " + memozation(arr, 0, 0));
        endTime = System.nanoTime();
        System.out.println("Executing in : " + (endTime - startTime));

        startTime = System.nanoTime();
        System.out.println("Tabulation : " + tabulation(arr, 0, 0));
        endTime = System.nanoTime();
        System.out.println("Executing in : " + (endTime - startTime));

        startTime = System.nanoTime();
        System.out.println("Space Optimization : " + spaceOptimization(arr));
        endTime = System.nanoTime();
        System.out.println("Executing in : " + (endTime - startTime));
    }

    public static int recursive(int[][] arr, int i, int j) {
        if (i == arr.length - 1) {
            return arr[arr.length - 1][j];
        }

        int downPath = arr[i][j] + recursive(arr, i + 1, j);
        int diagonalPath = arr[i][j] + recursive(arr, i + 1, j + 1);

        return Math.min(downPath, diagonalPath);
    }

    public static int memozation(int[][] arr, int i, int j) {
        int[][] dp = new int[arr.length][arr.length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(arr, i, j, dp);
    }

    public static int helper(int[][] arr, int i, int j, int[][] dp) {
        if (i == arr.length - 1) {
            return arr[arr.length - 1][j];
        }
        if (dp[i][j] != -1)
            return dp[i][j];

        int downPath = arr[i][j] + helper(arr, i + 1, j, dp);
        int diagonalPath = arr[i][j] + helper(arr, i + 1, j + 1, dp);

        return dp[i][j] = Math.min(downPath, diagonalPath);
    }

    public static int tabulation(int[][] arr, int i, int j) {
        int[][] dp = new int[arr.length][arr.length];

        for (j = 0; j < arr.length; j++) {
            dp[arr.length - 1][j] = arr[arr.length - 1][j];
        }

        for (i = arr.length - 2; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
                int downPath = arr[i][j] + dp[i + 1][j];
                int diagonalPath = arr[i][j] + dp[i + 1][j + 1];

                dp[i][j] = Math.min(downPath, diagonalPath);
            }
        }
        return dp[0][0];
    }

    public static int spaceOptimization(int[][] arr) {
        int[] dp = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            dp[k] = arr[arr.length - 1][k];
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int downPath = arr[i][j] + dp[j];
                int diagonalPath = arr[i][j] + dp[j + 1];

                dp[j] = Math.min(downPath, diagonalPath);
            }
        }
        return dp[0];
    }

}
