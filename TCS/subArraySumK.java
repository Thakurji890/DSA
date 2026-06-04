package TCS;

public class subArraySumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;
        bruteForce(arr, k);
        better(arr, k);
    }

    public static void bruteForce(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void better(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    // prefix sum
    public static void optimal(int[] arr, int k) {

    }

}
