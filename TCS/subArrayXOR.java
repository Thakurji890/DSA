package TCS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class subArrayXOR {

    // count subarrayy with xor as k
    // arr[] = {4,2,2,6,4} k = 6
    // {4,2} , {6}, {2,2,6} , {4,2,2,6,4}
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;

        for (List<Integer> list : better(arr, k)) {

            System.out.print(list + ", ");
        }

    }

    public static List<List<Integer>> better(int[] arr, int k) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int xor = 0;
            List<Integer> currentSubarray = new ArrayList<>();

            for (int j = i; j < n; j++) {
                xor = xor ^ arr[j];

                // Add the current element to our running subarray
                currentSubarray.add(arr[j]);

                if (xor == k) {
                    // Add a copy of the current subarray to the results
                    result.add(new ArrayList<>(currentSubarray));
                }
            }
        }

        return result;
    }

    public static List<List<Integer>> optimalSubarrays(int[] arr, int k) {
        int n = arr.length;
        int xr = 0;
        List<List<Integer>> result = new ArrayList<>();

        // Map to store the prefix XOR and a LIST of indices where it occurred
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Base case: A prefix XOR of 0 happens conceptually before the array starts
        // (index -1)
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];
            int x = xr ^ k;

            // If we have seen 'x' before, it means we found valid subarrays
            if (map.containsKey(x)) {
                // For every index where 'x' occurred, extract the subarray
                for (int startIdx : map.get(x)) {
                    List<Integer> subArray = new ArrayList<>();

                    // The valid subarray starts at startIdx + 1 and goes up to i
                    for (int j = startIdx + 1; j <= i; j++) {
                        subArray.add(arr[j]);
                    }
                    result.add(subArray);
                }
            }

            // Add the current prefix XOR and its index to the map
            map.putIfAbsent(xr, new ArrayList<>());
            map.get(xr).add(i);
        }

        return result;
    }

    public static int optimal(int[] arr, int k) {
        int n = arr.length;
        int xr = 0;
        int count = 0;

        // Map to store the frequency of prefix XORs
        Map<Integer, Integer> map = new HashMap<>();

        // Base case: A prefix XOR of 0 has been seen 1 time initially.
        // This handles cases where the prefix itself has an XOR exactly equal to k.
        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            // 1. Calculate the prefix XOR up to the current index
            xr = xr ^ arr[i];

            // 2. Calculate the required previous prefix XOR (x)
            int x = xr ^ k;

            // 3. If we have seen 'x' before, add its frequency to our count
            if (map.containsKey(x)) {
                count += map.get(x);
            }

            // 4. Add the current prefix XOR 'xr' to the map for future elements to use
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }

        return count;
    }
}
