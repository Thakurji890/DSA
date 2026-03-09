package DSA;

import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to Search : ");
        int find = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                System.out.println(find + " on Index at : " + i);
                break;
            }
        }
        sc.close();

    }
}
