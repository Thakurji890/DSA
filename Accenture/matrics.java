package Accenture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class matrics {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 7, 5, 4 };
        System.out.println(sumValBased(arr));
    }

    // 1. Sum of Second Smallest Element at Odd Positions and Largest at Even
    // Positions
    // Problem: Given an array, calculate the sum of the second-smallest element
    // from odd positions and the largest element from even positions.
    // Example: Input [3, 2, 1, 7, 5, 4], Output: 7

    public static int sumValBased(int[] arr) {
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0)
                evenNums.add(num);
            else
                oddNums.add(num);
        }
        if (oddNums.size() < 2 || evenNums.isEmpty())
            return 0;
        int largestEven = Collections.max(evenNums);
        Collections.sort(evenNums);
        int secondSmallestOdd = oddNums.get(0);

        return largestEven + secondSmallestOdd;
    }

}
