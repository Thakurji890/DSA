package ExamProb;

import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations var = new Operations();
        System.out.print("Enter Size of Linked List : ");
        int n = sc.nextInt(), count = 0;

        while (true) {
            if (count == n)
                break;
            int x = sc.nextInt();
            var.insertElement(x);
            count++;
        }
        sc.close();
        var.display();
        var.deleteLast();
        var.display();
        var.atPos(2);
        var.display();
    }
}

class Node {
    int data;
    Node next;
}

class Operations {
    Node head = null;

    void insertElement(int x) {
        Node node = new Node();
        node.data = x;
        node.next = null;

        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null\n");

    }

    void deleteLast() {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Last Element : " + temp.next.data);
        temp.next = null;
    }

    void atPos(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        temp.next = temp.next.next;
    }
}