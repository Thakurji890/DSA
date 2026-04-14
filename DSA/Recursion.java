package DSA;

public class Recursion {
    public static void main(String[] args) {
        // printSum(1, 5, 0);

        // System.out.println(factorial(10));

        // System.out.println(fibbonacci(10));

        // int a = 0, b = 1;
        // System.out.print(a + " " + b);
        // int n = 7;
        // printfib(a, b, n - 2);

        // System.out.println(powerOfX(2, 5));

        // towerOfHanoi(3, "Source ", " Helper ", " Destination");
        String str = "String";
        reverseString(str, str.length() - 1);
    }

    public static void printSum(int intial, int n, int sum) {
        if (intial == n) {
            sum += intial;
            System.out.println(sum);
            return;
        }
        sum += intial;
        printSum(intial + 1, n, sum);
    }

    public static long factorial(long n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static int fibbonacci(int n) {
        if (n <= 1)
            return n;
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }

    public static void printfib(int a, int b, int n) {
        if (n == 0)
            return;
        int c = a + b;
        System.out.print(" " + c);
        printfib(b, c, n - 1);
    }

    public static int powerOfX(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        // Stack Height will be n and level will be n + 1
        // return x * powerOfX(x, n - 1);

        // Stack height will be log(n) that more
        if (n % 2 == 0)
            return powerOfX(x, n / 2) * powerOfX(x, n / 2);
        else
            return (powerOfX(x, n / 2) * powerOfX(x, n / 2)) * x;
    }

    // Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, help);
        System.out.println("Transfer disk " + n + " from " + src + "to" + dest);
        towerOfHanoi(n - 1, help, src, dest);
    }

    public static void reverseString(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx) + " ");
            return;
        }
        System.out.print(str.charAt(idx) + " ");
        reverseString(str, idx - 1);
    }

}
