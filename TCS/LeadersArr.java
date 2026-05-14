package TCS;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersArr {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        // 22,12,6 -- becouse on this element everything on right
        // should is smaller element
        // bruteForce(arr);
        optimal(arr);

    }

    public static void bruteForce(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                list.add(arr[i]);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    // optimal

    public static void optimal(int[] arr) {
        int leader = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > leader) {
                list.add(arr[i]);
            }
            leader = Math.max(leader, arr[i]);
        }
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

}
