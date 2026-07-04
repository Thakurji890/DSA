package TCS;

public class SumOfPrime {
    public static void main(String[] args) {

        int n = 1;
        int m = 10;

        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
