package Day1;

public class Prob3 {
    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 };
        int[] nums = { 3, 2, 4 };
        // int target = 9;
        int target = 6;
        solution s = new solution();
        int[] arr = s.twoSum(nums, target);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

class solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;

    }

}
