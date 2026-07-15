package campx;

public class CountInversions {

    // conditions i < j and a [i] > a [j]
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        bruteForce(arr);
    }

    public static void bruteForce(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void betterSolution(int[] arr) {

    }

}
