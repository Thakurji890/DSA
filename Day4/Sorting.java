package Day4;

import java.util.Scanner;

public class Sorting {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Technics tech = new Technics();
        int[] arr = Sorting.inputData();

        boolean continueSorting = true;
        while (continueSorting) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Choose sorting method:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Exit");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    tech.bubbleSort(arr);
                    break;
                case 2:
                    tech.selectionSort(arr);
                    break;
                case 3:
                    tech.insertionSort(arr);
                    break;
                case 4:
                    tech.mergeSort(arr);
                    break;
                case 5:
                    tech.quickSort(arr);
                    break;
                case 6:
                    System.out.println("Exiting Program......!");
                    continueSorting = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static int[] inputData() {
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}

class Technics {
    // Bubble Sort
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array using Bubble Sort:");
        printArray(arr);
    }

    // Selection Sort
    void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array using Selection Sort:");
        printArray(arr);
    }

    // Insertion Sort
    void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array using Insertion Sort:");
        printArray(arr);
    }

    // Merge Sort
    void mergeSort(int[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
        System.out.println("Sorted array using Merge Sort:");
        printArray(arr);
    }

    void mergeSortHelper(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSortHelper(arr, l, m);
            mergeSortHelper(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort
    void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
        System.out.println("Sorted array using Quick Sort:");
        printArray(arr);
    }

    void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Print Array
    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// import java.util.Scanner;
// public class Main
// {
// static int[] o;
// static int[] s;

// public static void merge(int low, int mid, int high) {
// int l1, l2, i;

// for(l1=low, l2=mid+1, i=low; l1<=mid && l2<=high; i++) {
// if(o[l1] < o[l2])
// s[i] = o[l1++];
// else
// s[i] = o[l2++];
// }

// while(l1 <= mid)
// s[i++] = o[l1++];

// while(l2 <= high)
// s[i++] = o[l2++];

// for(int k=low; k<=high; k++)
// o[k] = s[k];
// }

// public static void mergeSort(int l, int h) {
// if(l < h) {
// int m = (l + h) / 2;

// mergeSort(l, m);
// mergeSort(m+1, h);
// merge(l, m, h);
// }
// else
// return;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// o = new int[n];
// s = new int[n];

// for(int i=0; i<n; i++) o[i] = sc.nextInt();

// mergeSort(0, n-1);

// for(int i=0; i<n; i++) System.out.print(o[i] + " ");
// }
// }