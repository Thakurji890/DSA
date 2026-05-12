package TCS;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

}
