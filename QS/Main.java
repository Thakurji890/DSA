package QS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BubbleSort var = new BubbleSort();
        // var.bubbleSort();
        var.rotate(3);
    }
}

class BubbleSort {
    int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;

    }

    void bubbleSort() {
        int[] arr = input();
        int count = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            count++;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println("Sorted Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumber of Switching is : " + count);
    }

    // k th terms rotations
    // Cyclic Array Rotation
    void rotate(int k) {
        int[] arr = input();
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
