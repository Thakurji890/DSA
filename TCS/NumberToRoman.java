package TCS;

import java.util.Scanner;

public class NumberToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman : ");
        String Roman = sc.next().toUpperCase();
        System.out.println("Roman to number is : " + romanToNumber(Roman));
    }

    public static int romanToNumber(String Roman) {
        int number = 0;
        for (int i = 0; i < Roman.length(); i++) {
            int currVal = codeNumber(Roman.charAt(i));

            if (i + 1 < Roman.length()) {
                int nextVal = codeNumber(Roman.charAt(i + 1));
                if (currVal < nextVal) {
                    number -= currVal;
                } else {
                    number += currVal;
                }
            } else {
                number += currVal;
            }
        }
        return number;
    }

    public static int codeNumber(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
