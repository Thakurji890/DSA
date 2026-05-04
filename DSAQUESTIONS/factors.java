package DSAQUESTIONS;

import java.util.ArrayList;
import java.util.Collections;

public class factors {

    public static void main(String[] args) {
        int n = 11;
        int a = 20, b = 30;
        factor(n);
        prime(n);
        GCD(a, b);
        Euclidian(a, b);
    }

    public static void factor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int limit = (int) Math.sqrt(n);
        for (int i = 1; i <= limit; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + "  ");
        }
        System.out.println();
    }

    public static void prime(int n) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i)
                    count++;
            }
        }
        System.out.println(count == 2 ? "Prime Number" : "Not a Prime Number");
    }

    // GCD / HCF
    public static void GCD(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD : " + gcd);
    }

    // |-> Euclidian Algo.
    public static void Euclidian(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            System.out.println(b);
        else
            System.out.println(a);
    }

}