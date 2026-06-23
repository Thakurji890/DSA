package campx;

import java.util.Scanner;

class TransactionFraud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("First input must be the number of transactions.");
            return;
        }

        int totalTransaction = sc.nextInt();

        Transaction[] t = new Transaction[totalTransaction];
        boolean[] fraud = new boolean[totalTransaction];

        for (int i = 0; i < totalTransaction; i++) {
            String sender = sc.next();
            String receiver = sc.next();
            double amount = sc.nextDouble();
            long time = sc.nextLong();
            t[i] = new Transaction(sender, receiver, amount, time);
        }

        for (int i = 0; i < totalTransaction; i++) {
            for (int j = i + 1; j < totalTransaction; j++) {
                if (t[i].sender.equals(t[j].sender) &&
                        t[i].receiver.equals(t[j].receiver) &&
                        t[i].amount == t[j].amount &&
                        Math.abs(t[i].time - t[j].time) <= 60) {
                    fraud[i] = true;
                    fraud[j] = true;

                }
            }
        }

        System.out.println("\nList of Fraud transaction :- ");
        for (int i = 0; i < totalTransaction; i++) {
            if (fraud[i]) {
                System.out.println(t[i].sender + " " + t[i].receiver + " " +
                        (long) t[i].amount + " " + t[i].time);
            }
        }
        sc.close();

    }
}

class Transaction {
    String sender;
    String receiver;
    double amount;
    long time;

    public Transaction(String sender, String receiver, double amount, long time) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.time = time;
    }
}