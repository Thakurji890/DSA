class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return fibbo(n, dp);
    }

    private int fibbo(int n, int[] dp) {
        if (n <= 1)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = fibbo(n - 1, dp) + fibbo(n - 2, dp);
    }
}
