package Day5;

import java.util.*;

public class RotateArray {
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5, 6 };
    // int h = 1;
    // rotate(arr, h);
    // System.out.println(Arrays.toString(arr));
    // }

    // public static void rotate(int[] arr, int n) {
    // n = n % arr.length;
    // reverse(arr, 0, arr.length - 1);
    // reverse(arr, 0, n - 1);
    // reverse(arr, n, arr.length - 1);
    // }

    // public static void reverse(int[] arr, int left, int right) {
    // while (left < right) {
    // int temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;
    // left++;
    // right--;
    // }
    // }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Main.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int actualSum = 0, N = n + 1;
        for (int num : arr) {
            actualSum += num;
        }

        int expectedSum = N * (N + 1) / 2;
        System.out.print(expectedSum - actualSum);
        sc.close();
    }

}