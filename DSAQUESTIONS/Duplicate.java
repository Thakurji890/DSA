package DSAQUESTIONS;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums2 = { 1, 1, 2 };
        int n = Solution(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int Solution(int[] nums) {
        int i = 0;
        int j = 1;
        for (; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i += 1;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
