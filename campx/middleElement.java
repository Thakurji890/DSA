package campx;

import java.util.Scanner;

class middleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            LinkedList list = new LinkedList();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.addLast(sc.nextInt());
            }
            list.middleNumber();
        }
    }

}

class LinkedList {
    class Node {
        int data;
        Node next = null;
    }

    Node head = null;

    void addLast(int x) {
        Node node = new Node();
        node.data = x;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void middleNumber() {
        if (head == null)
            return;

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

}