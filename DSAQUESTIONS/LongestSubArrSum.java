package DSAQUESTIONS;

import java.util.HashMap;

public class LongestSubArrSum {
    // longest subarray with sum k [positive]
    // arr = {1,2,3,1,1,1,4,2,3}
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 1, 1, 1, 4, 2, 3 };
        int[] arr = { 2, 0, 3 };
        int k = 3;
        twoPointer(arr, k);
        // Brute force

        // for (int i = 0; i < arr.length; i++) {
        // int sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // sum += arr[j];
        // if (sum == k) {
        // length = Math.max(maxLength, j - i + 1);
        // break;
        // }
        // }
        // }
        HashMap<Long, Integer> map = new HashMap<>(); // Store prefixSum -> index
        long sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: Entire subarray from index 0 to i sums to k
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            // Case 2: Check if (sum - k) exists in the map
            long rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLength = Math.max(maxLength, len);
            }

            // Edge Case: Only add sum to map if it's NOT already there
            // This keeps the leftmost index for the longest subarray
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(maxLength);
    }

    public static void twoPointer(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = 0;
        int maxLength = 0;
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        System.out.println(maxLength);
    }

}
