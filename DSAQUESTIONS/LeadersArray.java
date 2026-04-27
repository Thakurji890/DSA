package DSAQUESTIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.print("Size : ");
            int n = sc.nextInt();
            System.out.print("Inputs : ");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            findLeader(arr, arr.length);
        }
    }

    public static void findLeader(int[] arr, int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int currMax = arr[n - 1];
        leaders.add(currMax);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= currMax) {
                currMax = arr[i];
                leaders.add(currMax);
            }
        }
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.println(leaders.get(i) + (i == 0 ? "" : " "));
        }
        System.out.println();
    }

}
