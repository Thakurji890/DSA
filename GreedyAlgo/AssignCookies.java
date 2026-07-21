package GreedyAlgo;

import java.util.Arrays;

public class AssignCookies {
    // greed factor --> [1,5,3,3,4] -- 5 children
    // cookie size --> [4,2,1,2,1,3]
    public static void main(String[] args) {
        int[] factor = { 1, 5, 3, 3, 4 };
        int[] size = { 4, 2, 1, 2, 1, 3 };
        System.out.println(distribute(factor, size));
    }

    public static int distribute(int[] factor, int[] size) {
        Arrays.sort(factor);
        Arrays.sort(size);

        int n = factor.length, m = size.length;
        int left = 0, right = 0;
        while (left < m) {
            if (factor[right] <= size[left])
                right += 1;
            left += 1;
        }
        return right;
    }

}
