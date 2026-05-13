package TCS;

public class KandanesAlgo {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int[] arr = { -1, -2, -3, -4 };
        subArray(arr);
        Kanadane(arr);
    }

    // TC -> O(n^3) SP -> O(1)

    public static void subArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum > 0 ? maxSum : 0);
    }

    // optimal solution
    // O(n) O(1)
    public static void Kanadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;

        for (int i = 0; i < arr.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0)
                sum = 0;
        }
        System.out.print("Subarray : ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMax Sum : " + maxSum);
    }
}
