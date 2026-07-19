package DP;

public class Fibbonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(recFibbo(i) + " ");
        }
    }

    public static int recFibbo(int n) {
        if (n <= 1) {
            return n;
        }
        return recFibbo(n - 1) + recFibbo(n - 2);
    }

    public static void dpFibbo(int n) {
        int[] dp = new int[n + 1];

    }
}
