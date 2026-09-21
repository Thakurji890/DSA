package Accenture;

import java.util.List;
import java.util.ArrayList;

public class UniquePair {

    // 4. Find All Unique Pairs of Animal IDs
    // Problem: Given a list of integers representing animal IDs, find all unique
    // pairs.
    // Example: Input [1, 2, 3], Output: [(1, 2), (1, 3), (2, 3)]
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        List<String> result = solution(arr);
        System.out.println(result);

    }

    public static List<String> solution(int[] arr) {
        List<String> pairs = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairs.add("(" + arr[i] + "," + arr[j] + ")");
            }
        }
        return pairs;
    }

}
