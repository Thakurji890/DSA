package DSAQUESTIONS;

public class SortArray01 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        // Better solution
        int count_zeros = 0, count_ones = 0, count_twos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count_zeros++;
            if (arr[i] == 1)
                count_ones++;
            if (arr[i] == 2)
                count_twos++;
        }

        for (int i = 0; i < count_zeros; i++) {
            arr[i] = 0;
        }
        for (int i = count_zeros; i <= count_ones + count_ones; i++) {
            arr[i] = 1;
        }
        for (int i = count_ones + count_zeros; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        optimal(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void optimal(int[] arr) {
        // Dutch national Flag Algorithm
        // 3 pointer
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr[low], arr[mid]);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr[mid], arr[high]);
                high--;
            }
        }
    }

    public static void swap(int low, int mid) {
        int temp = low;
        low = mid;
        mid = temp;
    }
}
