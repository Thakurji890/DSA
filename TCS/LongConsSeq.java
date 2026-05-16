package TCS;

import java.util.Arrays;
import java.util.HashSet;

public class LongConsSeq {
    // Longest Consecutive Sequence
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        bruteForce(arr);
        better(arr);
        optimal(arr);
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
        int longest = 1, countCurr = 0, lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastSmaller) {
                countCurr += 1;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                countCurr = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, countCurr);
        }
        System.out.println(longest);

    }

    public static void optimal(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer integer : arr) {
            set.add(integer);
        }
        int longest = 1;

        for (Integer integer : set) {
            if (!set.contains(integer - 1)) {
                int count = 1;
                int x = integer;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }
}
