package TCS;

import java.util.ArrayList;
import java.util.List;

//             1
//         1       1
//     1       2       1
// 1       3        3       1

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(specificPosition(5, 3));
        printPascalTriangle(n);
        printingRow(n);

        Optimal var = new Optimal();
        var.printNumber(n);
    }

    public static long specificPosition(int row, int col) {
        int n = row - 1;
        int r = col - 1;

        // We only need to run the loop 'r' times.
        // Also, nCr == nC(n-r), so we can optimize further if r > n/2
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static void printPascalTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(specificPosition(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void printingRow(int row) {
        System.out.println("\nPrinting row : ");
        // for (int col = 1; col <= row; col++) {
        // System.out.print(specificPosition(row, col) + " ");
        // }
        // optimal
        int ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
    }

}

class Optimal {
    public List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add((int) ans);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRow) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i = 1; i <= numRow; i++) {
            pascalTriangle.add(generateRow(i));
        }
        return pascalTriangle;
    }

    void printNumber(int row) {
        List<List<Integer>> list = generate(row);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
