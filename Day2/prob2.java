package Day2;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Innerprob2 var = new Innerprob2();
        // int result = var.method(a, b);

        // int result = method(a, b);

        System.out.println("Result : " + method(a, b));

        sc.close();
    }

    public static int method(int a, int b) {
        return a + b;
    }

}

// class Innerprob2 {
// int method(int a, int b) {
// return a + b;
// }

// }
