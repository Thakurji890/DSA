package DP;

import java.util.Arrays;

// House Robber question

public class MaximumSumAdj {
    // Maximum sum of non- adjecent elements

    // you are given an arraylist of n integers.
    // you are supposed to return maximum subsequence with constraint
    // that no two element are adjacent in the given arraylist
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 9 };
        System.out.println(nonAdjacentSequenceRecursion(arr, arr.length - 1));
        System.out.println(memoized(arr, arr.length - 1));
        System.out.println(tabulation(arr, arr.length - 1));

        System.out.println(optimalSolution(arr, arr.length - 1));
    }

    public static int nonAdjacentSequenceRecursion(int[] arr, int index) {
        if (index == 0)
            return arr[index];
        if (index < 0)
            return 0;

        int pick = arr[index] + nonAdjacentSequenceRecursion(arr, index - 2);
        int notPick = nonAdjacentSequenceRecursion(arr, index - 1);

        return Math.max(pick, notPick);
    }

    public static int memoized(int[] arr, int index) {
        int[] dp = new int[index + 1];
        Arrays.fill(dp, -1);
        return helper(arr, arr.length - 1, dp);
    }

    public static int helper(int[] arr, int index, int[] dp) {
        if (index == 0)
            return arr[index];
        if (index < 0)
            return 0;
        if (dp[index] != -1)
            return dp[index];

        int pick = arr[index] + nonAdjacentSequenceRecursion(arr, index - 2);
        int notPick = nonAdjacentSequenceRecursion(arr, index - 1);

        return dp[index] = Math.max(pick, notPick);
    }

    public static int tabulation(int[] arr, int index) {
        int[] dp = new int[index + 1];

        dp[0] = arr[0];
        for (int i = 1; i <= index; i++) {
            int pick = arr[i];
            if (i > 1) {
                pick += dp[i - 2];
            }
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[index];
    }

    public static int optimalSolution(int[] arr, int index) {
        int prev = arr[0];
        int prev2 = 0;
        for (int i = 1; i < index; i++) {
            int pick = arr[index];
            if (i > 1) {
                pick += prev2;
            }
            int notPick = prev;
            int curr = Math.max(pick, notPick);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

}
