package Accenture;

import java.util.Arrays;

// 2. Find Product of Two Smallest Numbers in Array Whose Sum is Less Than Given Sum
// Problem: Given a sum and an array, find the product of the two smallest numbers whose sum is less than the given sum.
// Example: Input sum=9, arr=[5,4,2,3,9,1,7], Output: 2

public class product {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 9, 1, 7 };
        int sum = 9;
        Arrays.sort(arr);
        if (arr[0] + arr[1] < sum)
            System.out.println(arr[0] * arr[1]);
        else
            System.out.println(0);
    }
}
