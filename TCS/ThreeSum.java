package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    // problem is arr[i] + arr[j] + arr[k] = 0 where (i != j != k)
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        // [-1,2,1]
        // [0,1,-1]

        // List<List<Integer>> list = brute(arr);
        // List<List<Integer>> list = better(arr);
        List<List<Integer>> list = optimal(arr);

        for (List<Integer> list2 : list) {
            System.out.print(list2);
        }

    }

    // n^3
    public static List<List<Integer>> brute(int[] nums) {
        int n = nums.length;

        // Using a HashSet to automatically store only unique triplets
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        // Three nested loops to try all possible combinations
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    // If the sum is zero, we found a valid triplet
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);

                        // Sort the triplet so duplicate combinations look identical
                        Collections.sort(temp);

                        // Add to the HashSet to filter out any duplicates
                        uniqueTriplets.add(temp);
                    }
                }
            }
        }

        // Convert the set back to a List of Lists to match the return type
        return new ArrayList<>(uniqueTriplets);
    }

    public static List<List<Integer>> better(int[] arr) {
        int n = arr.length;

        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);

                if (hashSet.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);

                    Collections.sort(temp);
                    uniqueTriplets.add(temp);
                }
                hashSet.add(arr[j]);
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }

    public static List<List<Integer>> optimal(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);

                    list.add(temp);
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                }
            }
        }

        return list;
    }
}
