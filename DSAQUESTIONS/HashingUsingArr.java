package DSAQUESTIONS;

import java.util.Scanner;

public class HashingUsingArr {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // feqNumber();
        freqChar();
    }

    public static void freqChar() {
        System.out.print("Enter String : ");
        String str = sc.next();
        char[] strChar = str.toCharArray();
        int[] Hash = new int[256];

        for (int i = 0; i < strChar.length; i++) {
            Hash[strChar[i] - 'a'] += 1;
        }

        System.out.print("Enter how many time u want to access the character : ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Input :  ");
            char ch = sc.next().charAt(0);
            System.out.println("Freq is : " + Hash[(int) ch - 'a']);
        }

    }

    public static void feqNumber() {

        System.out.print("Number of Input: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Input elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // --- THE FIX ---
        // You must know the maximum value the input can take.
        // If the problem says values are up to 10^6:
        int[] Hash = { 0 };

        // Precomputation
        for (int i = 0; i < n; i++) {
            Hash[arr[i]] += 1;
        }

        System.out.print("Number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("\nEnter number to find: ");
            int a = sc.nextInt();

            // Check to avoid crash if user inputs a number larger than Hash size
            if (a < Hash.length) {
                System.out.println("Frequency: " + Hash[a]);
            } else {
                System.out.println("Frequency: 0");
            }
        }
    }
}