package TCS;

import java.util.Scanner;

public class BinaryToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal number : ");
        int decimal = sc.nextInt();
        System.out.println("Binary code for " + decimal +
                " is : " + numberToBinary(decimal));

        System.out.print("enter Binary number : ");
        String binary = sc.next();
        System.out.println("Decimal code for " + decimal +
                " is : " + binaryToNumber(binary));
    }

    public static String numberToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static int binaryToNumber(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';

            decimal += digit * (int) Math.pow(2, power);

            power++;
        }

        return decimal;
    }
}
