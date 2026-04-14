package Day1;

import java.util.Scanner;

class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 8 or 10 Digit Number : ");
        int num = sc.nextInt();
        System.out.print("Sum of Given number is : " + singleDigitReturn(num));
        sc.close();
    }

    public static int singleDigitReturn(int num) {
        int temp = num, sum = 0;
        if (num < 10) {
            return num;
        } else {
            while (temp > 0) {
                int d = temp % 10;
                sum += d;
                temp /= 10;
            }
            if (sum >= 10) {
                return singleDigitReturn(sum);
            }
            return sum;
        }
    }
}