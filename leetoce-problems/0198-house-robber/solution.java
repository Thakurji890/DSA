class Solution {
    public int rob(int[] nums) {
        int index = nums.length - 1;
        int[] dp = new int[index + 1];
        Arrays.fill(dp, -1);
        return helper(nums, index, dp);
    }

    private int helper(int[] nums, int index, int[] dp) {
        if (index == 0)
            return nums[index];
        if (index < 0)
            return 0;
        if (dp[index] != -1)
            return dp[index];

        int pick = nums[index] + helper(nums, index - 2, dp);

        int notPick = helper(nums, index - 1, dp);

        return dp[index] = Math.max(pick, notPick);
    }
}
