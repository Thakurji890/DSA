package DSA;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 9, 2 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        display(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        display(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = current;
        }
        display(arr);
    }

    public static void display(int[] arr) {
        System.out.println("Sorted Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
