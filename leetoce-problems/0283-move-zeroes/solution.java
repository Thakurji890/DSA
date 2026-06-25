class Solution {
    public void moveZeroes(int[] nums) {
        int trackZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[trackZero] = nums[i];
                trackZero++;
            }
        }

        while(trackZero < nums.length) {
            nums[trackZero] = 0;
            trackZero ++;
        }
    }
}
