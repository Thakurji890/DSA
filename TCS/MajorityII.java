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
}
