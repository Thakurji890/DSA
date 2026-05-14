package TCS;

import java.util.Arrays;

public class LongConsSeq {
    // Longest Consecutive Sequence
    public static void main(String[] args) {
        int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        bruteForce(arr);
    }

    public static void bruteForce(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            count = 1;
            while (linearSearch(arr, x + 1)) {
                x = x + 1;
                count += 1;
            }
        }
        System.out.println("maximum : " + count);

    }

    public static boolean linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }

    public static void better(int[] arr) {
        Arrays.sort(arr);
        int lastSmallest = Integer.MIN_VALUE;
        int longest = 1;
        int countCurr = 0;
        for (int i = 0; i < arr.length; i++) {

        }

    }

    public static void optimal(int[] arr) {

    }
}
