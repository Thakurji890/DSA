package DSAQUESTIONS;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        // SelectionSort(arr);
        // BubbleSort(arr);
        InsertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    public static void BubbleSort(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j <= arr.length - 1; j++) {
        // if (arr[i] > arr[j]) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        for (int i = arr.length - 1; i >= 0; i--) {
            int swapHappen = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapHappen = 1;
                }
            }
            if (swapHappen == 0)
                break;
        }
    }

    public static void InsertionSort(int[] arr) {

    }

}
