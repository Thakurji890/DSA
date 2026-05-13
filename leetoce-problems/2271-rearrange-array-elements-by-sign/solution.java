class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int negIdx = 1, posIdx = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                arr[posIdx] = nums[i];
                posIdx += 2;
            } else {
                arr[negIdx] = nums[i];
                negIdx += 2;
            }
        }
        return arr;
    }
}
