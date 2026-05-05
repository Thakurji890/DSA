package DSAQUESTIONS;

public class printNumber {

    public static void main(String[] args) {
        int n = 5;
        printNum(n, n);
        System.out.println("\n" + printSum(n));
        System.out.println(factorial(n));
        System.out.println(isPllamindrome("MADM", 0));
        fibbo(n);
        System.out.println("\nLast Element : of Fibbonacci Series : " + fibboRec(n));
    }

    public static void printNum(int n, int i) {
        if (i < 1)
            return;
        System.out.print(i + " ");
        printNum(n, i - 1);
        System.out.print(i + " ");
    }

    public static int printSum(int n) {
        if (n == 0)
            return 0;
        return n + printSum(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static boolean isPllamindrome(String s, int i) {
        if (i >= s.length() / 2)
            return true;
        char[] charArr = s.toCharArray();
        if (charArr[i] != charArr[charArr.length - i - 1])
            return false;
        else
            return isPllamindrome(s, i + 1);
    }

    public static void fibbo(int n) {
        int a = 0;
        int b = 1;
        System.out.print("Fibbonacci : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

        }
    }

    // multiple recursion calls
    public static int fibboRec(int n) {
        if (n <= 1)
            return n;
        return fibboRec(n - 1) + fibboRec(n - 2);
    }
}