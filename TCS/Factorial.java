package TCS;

public class Factorial {
    public static void main(String[] args) {
        long n = 5;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        System.out.println(fact(n));
    }

    public static long fact(long n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
