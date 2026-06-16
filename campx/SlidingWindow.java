package campx;

public class SlidingWindow {
    public static void main(String[] args) {
        int k = 3;
        int n = 8;
        int[] arr = { 2, 1, 5, 4, 6, 1, 7 };

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }

}
