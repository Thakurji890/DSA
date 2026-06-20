package campx;

import java.util.Scanner;

import java.util.Stack;

public class webTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();

            Stack<String> history = new Stack<>();

            for (int i = 0; i < n; i++) {
                String operation = sc.nextLine();

                if (operation.startsWith("VISIT")) {
                    String[] parts = operation.split(" ");
                    String url = parts[1];
                    history.push(url);
                } else if (operation.startsWith("BACK")) {
                    if (history.isEmpty()) {
                        System.out.println("Empty");
                    } else {
                        System.out.println(history.pop());
                    }
                }
            }

        }
        sc.close();
    }
}
