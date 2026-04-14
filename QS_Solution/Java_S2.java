package QS_Solution;

// 27_2025 - 1
import java.util.Scanner;

public class Java_S2 {
    public static void main(String[] args) {
        Solution var = new Solution();

        // Q1.
        // var.findMInMax();

        // Q2.
        // var.printPyramid(4);

        // Q3.
        // var.feeCalcultion(8);

        // Q4.
        var.emailValidation();

    }
}

class Solution {

    // Question - 1
    void findMInMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        String[] str = sc.nextLine().split(",");

        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i].trim());
        }
        sc.close();

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Maximum Element in array : " + max);
        System.out.print("\nMinimum Element in array : " + min);
    }

    // Question - 2

    void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            int space = n - i - 1;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Question - 3

    void feeCalcultion(int day) {
        float fine = 0;
        if (day >= 30) {
            System.out.println("Your Membership is Cancelled");
            return;
        } else if (day > 10) {
            fine += 5 * day;
        } else if (day >= 6 || day <= 10) {
            fine += 1 * day;
        } else if (day >= 1 || day <= 5) {
            fine += 0.50 * day;
        }
        System.out.printf("Total Fine is : %.2f", fine);

    }

    // Question - 4
    void emailValidation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email Address : ");
        String email = sc.nextLine();
        sc.close();

        char[] chars = email.toCharArray();
        int atIndex = -1;
        int dotIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '@') {
                if (atIndex == -1) {
                    atIndex = i;
                }
            } else if (chars[i] == '.') {
                dotIndex = i;
            }
        }
        if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < chars.length - 1) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
    }
}