package Day1;

import java.util.Scanner;

public class Prob2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Time : ");
        String time = sc.nextLine();

        formatChange(time);
        sc.close();

    }

    public static void formatChange(String time) {
        String[] arr = time.split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        String var = arr[2];
        // System.out.println(h + " " + m + " " + var);

        if (h > 12) {
            System.out.print("Invalid Time.!");
        } else {
            if (var.equalsIgnoreCase("AM")) {
                if (h == 12) {
                    h = 00;
                }
            } else if (var.equalsIgnoreCase("PM")) {
                if (h != 12) {
                    h += 12;
                } else if (h == 12) {
                    h = 12;
                }

            } else {
                System.out.println("Invalid Time.");
            }
            System.out.println("Converted Time is : " + h + " " + m);
        }

    }
}
