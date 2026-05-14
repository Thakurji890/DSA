package TCS;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        generate(arr, new ArrayList<Integer>(), new boolean[arr.length]);
        stringPermute("ABC", "");
    }

    // 1 Approach
    public static void generate(int[] arr, ArrayList<Integer> list, boolean[] used) {
        if (list.size() == arr.length) {
            System.out.println(list);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                list.add(arr[i]);
                generate(arr, list, used);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void stringPermute(String str, String res) {
        if (str.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            stringPermute(rem, res + ch);
        }
    }
}
