package BinarySearch;

public class RotatedSortedArray1 {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int target = 1;
        System.out.println(solution(arr, target));
    }

    public static int solution(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[left] <= arr[mid]) {

                if (arr[left] <= target && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;

            } else {
                if (arr[mid] < target && target < arr[right])
                    right = mid + 1;
                else
                    left = mid - 1;
            }
        }
        return -1;
    }

}
