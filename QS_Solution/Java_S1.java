package QS_Solution;
// 27_2025 - 1

import java.util.Scanner;

public class Java_S1 {
    public static void main(String[] args) {
        solution var = new solution();
        // Q1.
        // var.addElement(5, 3);

        // Q2.
        // var.patternPrinting(10);

        // Q3.
        // var.password("abCde@123");

        // Q4.
        var.validation(55, 10, 4500);
    }
}

class solution {

    // Question - 1

    void addElement(int n, int pos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element : ");
        String[] str = sc.nextLine().split(","); // .split("\\s,*")

        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i].trim()); // trim() -> spaces remove
        }
        sc.close();

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < pos) {
                newArr[i] = arr[i];
            } else if (i == pos) {
                newArr[i] = n;

            } else {
                newArr[i] = arr[i - 1];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
    }

    // Question - 2

    void patternPrinting(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Question - 3

    void password(String pass) {

        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isSpecial = false;

        if (pass.length() < 9) {
            System.out.print("Password Not Perfect");
            return;
        }
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                isUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                isLower = true;
            } else if (ch >= '0' && ch <= '9') {
                isDigit = true;
            } else if (isSpecialChar(ch)) {
                isSpecial = true;
            }
        }
        if (isUpper && isLower && isDigit && isSpecial) {
            System.out.println("Password is Perfect");
        } else {
            System.out.println("Password Not Perfect");
        }

    }

    boolean isSpecialChar(char ch) {
        String specialChars = "!@#$%^&*()_+-=?<>.,";
        return specialChars.indexOf(ch) != -1;
    }

    // Question - 4

    void validation(double hardness, double carbon, double tensile) {
        if (hardness > 50 && carbon < 0.7 && tensile > 5600)
            System.out.print("Grade : " + 10);
        else if (hardness > 50 && carbon < 0.7)
            System.out.print("Grade : " + 9);
        else if (carbon < 0.7 && tensile > 5600)
            System.out.print("Grade : " + 8);
        else if (hardness > 50 && tensile > 5600)
            System.out.print("Grade : " + 7);
        else if (hardness > 50 || carbon < 0.7 || tensile > 5600)
            System.out.print("Grade : " + 6);
        else
            System.out.print("Grade : " + 5);

    }
}
