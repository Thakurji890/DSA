package TCS;

public class FibbonacciSeries {
    public static void main(String[] args) {
        // fibbo(5);
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(fibboRec(i));
        }
    }

    public static void fibbo(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static int fibboRec(int n) {
        if (n <= 1)
            return n;
        return fibboRec(n - 1) + fibboRec(n - 2);
    }
}
