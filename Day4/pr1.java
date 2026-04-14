package Day4;

import java.util.Scanner;

// Searching & Sorting --> linear , binary

public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorting srt = new Sorting();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        System.out.print("Enter Number to be Search : ");
        int n = sc.nextInt();

        srt.binarySearch(arr, n);

        System.out.print("Is element Present in an array : " + srt.binarySearchRec(arr, 0, arr.length - 1, n));
        sc.close();
    }

}

class Sorting {

    // Binary Search

    void binarySearch(int[] arr, int n) {
        int lower = 0, higher = arr.length - 1, mid;
        while (lower <= higher) {
            mid = lower + (higher - lower) / 2;
            if (arr[mid] == n) {
                System.out.println("Element is Index at : " + mid);
                return;
            } else if (arr[mid] < n)
                lower = mid + 1;
            else if (arr[mid] > n)
                higher = mid - 1;
            else
                System.out.print("Searched Element Not Found on Given array.");
        }
    }

    // Binary Search Using Recurssion
    boolean binarySearchRec(int[] arr, int lower, int higher, int n) {
        if (lower > higher)
            return false;
        int mid = (lower + higher) / 2;
        if (arr[mid] == n)
            return true;
        else if (arr[mid] < n)
            return binarySearchRec(arr, mid + 1, higher, n);
        else
            return binarySearchRec(arr, lower, mid - 1, n);
    }
}
