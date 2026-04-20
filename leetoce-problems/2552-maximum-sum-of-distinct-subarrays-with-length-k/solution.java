class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long currSum = 0 , maxSum = 0;
        int i = 0 ; 
        for(int j = 0 ; j < nums.length ; j++) {
            while(set.contains(nums[j]) || set.size() == k) {
                set.remove(nums[i]);
                currSum -= nums[i];
                i++;
            }
            currSum += nums[j];
            set.add(nums[j]);
            if(set.size() == k) {
                maxSum = Math.max(currSum , maxSum);
            }
        }
        return maxSum;        
    }
}
