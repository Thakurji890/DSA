package DP;

import java.util.Arrays;

public class MinimumFallingPath {

    // Problem Statement: Minimum Falling Path SumGiven an $N \times M$
    // matrix of integers, return the minimum sum of any falling path
    // through the matrix.Rules for a falling path:You can start at any
    // element in the first row.From each element, you can move to the
    // next row, picking an element that is directly below or diagonally
    // to the left/right.Specifically, if you are at position (row, col),
    // your next move can be to:(row + 1, col - 1) (Diagonal Left)
    // (row + 1, col) (Straight Down)(row + 1, col + 1) (Diagonal Right)
    // The path ends when you reach the last row.
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 10, 4 },
                { 100, 3, 2, 1 },
                { 1, 1, 20, 2 },
                { 1, 2, 2, 1 }
        };
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;

        for (int j = 0; j < m; j++) {
            // max = Math.max(max, recursion(arr, n - 1, j));
            max = Math.max(max, memoization(arr, n - 1, j, n, m));
        }

        System.out.println(max);

    }

    public static int recursion(int[][] arr, int i, int j) {
        if (j < 0 || j >= arr[0].length)
            return (int) -1e9;
        if (i == 0)
            return arr[0][j];
        int up = arr[i][j] + recursion(arr, i - 1, j);
        int leftDiagonal = arr[i][j] + recursion(arr, i - 1, j - 1);
        int rightDiagonal = arr[i][j] + recursion(arr, i - 1, j + 1);
        return Math.max(up, Math.max(rightDiagonal, leftDiagonal));
    }

    public static int memoization(int[][] arr, int i, int j, int n, int m) {
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(arr, i, j, dp);
    }

    public static int helper(int[][] arr, int i, int j, int[][] dp) {
        if (j < 0 || j >= arr[0].length)
            return (int) -1e9;

        if (i == 0)
            return arr[0][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = arr[i][j] + helper(arr, i - 1, j, dp);
        int leftDiagonal = arr[i][j] + helper(arr, i - 1, j - 1, dp);
        int rightDiagonal = arr[i][j] + helper(arr, i - 1, j + 1, dp);
        return dp[i][j] = Math.max(up, Math.max(rightDiagonal, leftDiagonal));
    }

}
