package Accenture;

public class SecondLargest1000 {

    // 3. Find Second Largest Number in Array of 1000 Integers
    // Problem: Given an array of 1000 integers, find the second-largest number
    // (return -1 if none exists).
    // Example: Input num1=3, num2=[2,1,2], Output: 1
    public static void main(String[] args) {
        int[] arr = { 2, 1, 2 };
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
