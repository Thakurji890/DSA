package QS_Solution;

// 27_2025 - 1
import java.util.Scanner;

class Java_S3 {
    public static void main(String[] args) {
        Solution var = new Solution();

        // Q1.
        // var.sequenceElement();

        // Q2.
        // var.patternPrinting(7);

        // Q3.
        // var.electricBill();

        // Q4.
        var.mirrorComparator();

    }
}

class Solution {
    // Question - 1
    void sequenceElement() {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("\\s*,\\s*");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int min = arr[0], max = arr[0], count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if ((max - min + 1) == arr.length) {
                count += 1;
            }

        }
        System.out.println("Total consecutive number is : " + count);

        sc.close();
    }

    // Question - 2

    Void patternPrinting(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
        return null;
    }

    // Question - 3

    void electricBill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Unit : ");
        double unit = sc.nextDouble();
        double bill = 0;
        if (unit <= 199)
            bill += 1.20 * unit;
        else if (unit >= 200 && unit <= 399)
            bill += 1.50 * unit;
        else if (unit >= 400 && unit <= 599)
            bill += 1.80 * unit;
        else if (unit >= 600)
            bill += 2.00 * unit;

        double surCharge = 0;
        if (bill <= 100) {
            bill = 100;
        } else if (bill >= 300) {
            surCharge = bill * 0.15;
        }
        System.out.printf("Bill : %.2f\n", bill);
        System.out.printf("Surcharge : %.2f\n", surCharge);
        System.out.printf("Net Amount Payable : %.2f\n", (bill + surCharge));

        sc.close();
    }

    // Question - 4

    void mirrorComparator() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            strRev += ch;
        }
        if (str.equals(strRev))

            System.out.println("Original: " + str + "\nReversed: " + strRev + "\nMirror Text");
        else
            System.out.println("Not Mirror Text");

        sc.close();
    }

}