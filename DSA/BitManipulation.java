package DSA;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        // countOnes();
        // decToBin();
        binToDec();
    }

    public static void poerOfTwo() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println("it is Power of two");
        else
            System.out.println("not");
        sc.close();
    }

    public static void countOnes() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        sc.close();
        System.out.println("Number of 1's : " + count);
    }

    public static void decToBin() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();
        int temp = n;
        if (n == 0) {
            System.out.println("Binary : 0");
            return;
        }
        while (temp != 0) {
            int d = temp % 2;
            str = str.append(d);
            temp /= 2;
        }
        System.out.println("Decimal To Binary form : " + str.reverse());
        sc.close();
    }

    public static void binToDec() {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int binInt = Integer.parseInt(bin);
        int temp = binInt, decimal = 0, base = 1;
        while (temp > 0) {
            int lastDigit = temp % 10;
            decimal += lastDigit * base;
            base *= 2;
            temp /= 10;
        }
        System.out.println("Decimal : " + decimal);

        sc.close();
    }
}
