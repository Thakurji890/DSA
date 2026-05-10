package DSAQUESTIONS;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 5;
        System.out.println(binarySearch(arr, k));
        System.out.println(recBinarySearch(arr, k, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] > k)
                left++;
            else
                right--;
        }
        return -1;
    }

    public static int recBinarySearch(int[] arr, int k, int left, int right) {
        if (left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == k)
            return mid;
        else if (arr[mid] > k)
            return recBinarySearch(arr, k, left, mid - 1);
        else
            return recBinarySearch(arr, k, mid + 1, right);
    }
}
