package DSAQUESTIONS;

import java.util.HashMap;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(lengthOfWindow(arr, k));
    }

    public static int lengthOfWindow(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        long currSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == k) {
                maxLength = i + 1;
            }
            if (map.containsKey(currSum - k))
                maxLength = Math.max(maxLength, i - map.get(currSum - k));
            if (!map.containsKey(currSum))
                map.put(currSum, i);
        }
        return maxLength;
    }

}
