package campx;

public class productSubarry {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        bruteForce(arr);
        optimal(arr);
    }

    public static void bruteForce(int[] arr) {
        long max = 1;
        for (int i = 0; i < arr.length; i++) {
            long product = 1;
            for (int j = i; j < arr.length; j++) {

                // for (int k = i; k <= j; k++) {
                // product *= arr[k];
                // }
                // max = Math.max(max, product);
                product *= arr[j];
                max = Math.max(max, product);
            }
        }
        System.out.println(max);
    }

    public static void optimal(int[] arr) {
        int prefix = 1, suffix = 1;
        int max = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;
            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length - i - 1];
            max = Math.max(max, Math.max(suffix, prefix));
        }
        System.out.println(max);
    }
}
