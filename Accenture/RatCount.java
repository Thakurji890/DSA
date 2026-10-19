package Accenture;

public class RatCount {

    // Problem Statement:
    // An array represents the amount of food present in a line of houses. You are
    // given r (the total number of rats) and unit (the amount of food each rat
    // consumes). Calculate the minimum number of houses needed to satisfy the total
    // food required by all rats. If the array is empty, return -1. If the total
    // food in all houses is insufficient, return 0.
    // • Input: r = 7, unit = 2, arr = [2, 8, 3, 5, 7, 4, 1, 2]
    // • Output: 4
    // • Explanation: Total food required = 7 * 2 = 14. Summing elements from index
    // 0: 2 + 8 + 3 = 13 (still less than 14). Adding the 4th house gives 13 + 5 =
    // 18 (>= 14). So, 4 houses are required.
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int[] arr = { 2, 8, 3, 5, 7, 4, 1, 2 };
        System.out.println(Solution(arr, r, unit));
    }

    public static int Solution(int[] arr, int r, int unit) {
        int totalFood = r * unit;
        int currFood = 0;
        for (int i = 0; i < arr.length; i++) {
            currFood += arr[i];
            if (currFood >= totalFood) {
                return i + 1;
            }
        }
        return 0;
    }
}
