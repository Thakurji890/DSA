package DSAQUESTIONS;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 2, 2, 5, 7, 4, 3, 4 };
        int[] result = twoSum(nums, 10);
        int[] Optimal = OptimalTwoSum(nums, 10);
        for (int num : Optimal) {
            System.out.print(num + " ");
        }
    }

    // Better Solution
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[] { map.get(complement), i };
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    // Optimal Solution
    public static int[] OptimalTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { nums[left], nums[right] };
            } else if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }
}