package DSAQUESTIONS;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 2, 2, 5, 7, 4, 3, 4 };
        int[] result = twoSum(nums, 10);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

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
}