package DSAQUESTIONS;

public class printNumber {

    public static void main(String[] args) {
        int n = 10;
        printNum(n, n);
    }

    public static void printNum(int n, int i) {
        if (i < 1)
            return;
        System.out.print(i + " ");
        printNum(n, i - 1);
        System.out.print(i + " ");
    }
}