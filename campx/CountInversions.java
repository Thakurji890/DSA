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

        System.out.println(countInversions(arr));
    }

    // Optimal Solution

    public static long mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        long count = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;
            count += mergeSortAndCount(arr, temp, left, mid);

            count += mergeSortAndCount(arr, temp, mid + 1, right);

            count += mergeAndCount(arr, temp, left, mid, right);
        }

        return count;
    }

    public static long mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        long count = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }

    public static long countInversions(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

}
