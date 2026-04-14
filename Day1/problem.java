package Day1;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = readArray(str);
        int max = maxSubarray(arr, 2);
        System.out.println(max);
        sc.close();

    }

    public static int[] readArray(String input) {
        String[] parts = input.trim().split("\\s+");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        return arr;
    }

    public static int maxSubarray(int[] arr, int k) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k - 1) {
                max = Math.max(max, sum);
                sum -= arr[i - k + 1];
            }
        }
        return max;
    }

}
