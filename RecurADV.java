package DSA;

import java.util.ArrayList;

//  Back tracking Concept

public class RecurADV {
    public static void srtPer(String str, String permutaion) {
        if (str.length() == 0) {
            System.out.println(permutaion);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            srtPer(newStr, permutaion + ch);
        }
    }

    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // Down paths
        int downPaths = countPaths(i + 1, j, n, m);

        // Right Paths
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static int callGuests(int n) {
        if (n <= 1)
            return 1;
        int way1 = callGuests(n - 1);

        int way2 = (n - 1) * callGuests(n - 2);

        return way1 + way2;
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            System.out.println(subset);
            return;
        }
        subset.add(n);
        findSubsets(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void printSet(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // srtPer("abc", "");

        // int n = 3, m = 4;
        // System.out.println(countPaths(0, 0, n, m));

        // System.out.println(callGuests(4));

        ArrayList<Integer> subset = new ArrayList<>();
        int n = 4;
        findSubsets(n, subset);
        printSet(subset);
    }
}
