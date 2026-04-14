package QS_Solution;

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array Element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to be search : ");
        int n = sc.nextInt();
        search(arr, n);
        sc.close();
    }

    public static void search(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.print("Element is Found at Index Postion is : " + i);
                break;
            }
        }
    }

}
