package BinarySearch;

public class LowerBound {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        int n = 16;
        System.out.println(lowerBound(arr, n));
        System.out.println(upperBound(arr, n));
    }

    // Lower Bound -> Smallest index such that (arr[mid] >= n)
    public static int lowerBound(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;

        int lower = right + 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= n) {
                lower = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return lower;
    }

    // Upper Bound -> Smallest index such that (arr[mid] > n)
    public static int upperBound(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;

        int upper = right + 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > n) {
                upper = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return upper;
    }

    // Search the position and insert it on the currect
    // position and maintaing the sorting arr property
    // Same code as lower bound

}
