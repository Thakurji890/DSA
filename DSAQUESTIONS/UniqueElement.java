package DSAQUESTIONS;

import java.util.HashMap;

public class UniqueElement {

    // find the number that appears once and the other twice
    // arr = {1,1,2,2,3,4,4};
    // answer is 3
    public static void main(String[] args) {
        // brute force approach

        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(temp);
                break;
            }
        }

        // better solution
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }

        // Optimal XOR
        int XOR = 0;
        for (int i : arr) {
            XOR ^= i;
        }
        System.out.println(XOR);
    }
}
