package Accenture;

import java.util.ArrayList;
import java.util.Collections;

public class LargeSmallSum {

    // Problem Statement:
    // Write a function that accepts an array and returns the sum of the second
    // largest element from the even positions and the second smallest element from
    // the odd positions (0-indexed). Return 0 if the array length is 3 or less.
    // • Input: [3, 2, 1, 7, 5, 4]
    // • Output: 7
    // • Explanation:
    // • Even-indexed elements: [3, 1, 5] -> Second largest is 3.
    // • Odd-indexed elements: [2, 7, 4] -> Second smallest is 4.
    // • Result: 3 + 4 = 7.
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 7, 5, 4, 9, 10 };

        System.out.println(Solution(arr));
    }

    public static int Solution(int[] arr) {
        if (arr.length <= 3)
            return 0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        return even.get(even.size() - 2) + odd.get(1);

    }

}
