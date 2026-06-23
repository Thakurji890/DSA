package campx;

import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            LinkedList<Integer> list = new LinkedList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            for (int num : list) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

    }

}
