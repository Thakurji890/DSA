package TCS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityII {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        int n = (int) Math.floor(arr.length / 3);
        for (Integer num : usingHashMap(arr, n)) {
            System.out.print(num + " ");
        }

    }

    public static List<Integer> usingHashMap(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer num : map.keySet()) {
            if (map.get(num) > n) {
                list.add(num);
            }
        }

        return list;
    }

    public static List<Integer> optimal(int[] arr, int n) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;

        int cand1 = 0, cand2 = 1; // different initial values
        int count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == cand1) {
                count1++;
            } else if (num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // verify
        count1 = 0; count2 = 0;
        for (int num : arr) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        if (count1 > n) result.add(cand1);
        if (cand2 != cand1 && count2 > n) result.add(cand2);
        return result;
    }
}
