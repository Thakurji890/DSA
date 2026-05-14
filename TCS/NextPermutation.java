package TCS;

import java.util.ArrayList;

public class NextPermutation {
    // arr[] = 3,1,2
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, };
        Permutation.generate(arr, new ArrayList<Integer>(), new boolean[arr.length]);
    }

}
