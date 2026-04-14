package QS_Solution;

public class pr2 {
    public static void main(String[] args) {
        Solution var = new Solution();
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        var.suffleArray(nums, n);
    }
}

class Solution {
    void suffleArray(int[] nums, int n) {
        int[] newArr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            // if (i % 2 == 0) {
            // newArr[i] = nums[i];
            // }
            System.out.print(newArr[i] + " ");
        }
    }
}
