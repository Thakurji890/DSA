package BinarySearch;

public class Ques1 {

    // [3,4,6,7,9,12,16,17] n = 8;
    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };
        int n = 12;
        System.out.println(search(arr, n));
    }

    public static int search(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
