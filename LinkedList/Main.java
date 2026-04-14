package LinkedList;

// import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LinkedList var = new LinkedList();
        var.addAtBeg(10);
        var.addAtBeg(2);
        var.addAtBeg(40);

        var.addAtLast(10);
        var.addAtLast(2);
        var.addAtLast(30);

        var.addAtPos(10, 4);
        var.display();
        System.out.print("Null\n");

        // Deletion part

        var.delAtBeg();
        var.display();
        var.delAtLast();
        var.display();
        var.delAtPos(3);
        var.display();

    }
}

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head = null;

    void addAtBeg(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null)
            head = node;
        else {
            Node temp = head;
            head = node;
            node.next = temp;
        }
    }

    void delAtBeg() {
        if (head == null)
            return;
        else if (head.next == null)
            head = null;
        else
            head = head.next;

    }

    void addAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

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

    void delAtLast() {
        if (head == null)
            return;
        else if (head.next == null)
            head = null;
        else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void addAtPos(int data, int pos) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (pos == 1) {
            node.next = head;
            head = node;
            return;
        }

        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        node.next = temp.next;
        temp.next = node;

    }

    void delAtPos(int pos) {
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

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");

        Operations var = new Operations();
        var.addElements(head);
        var.reverseList(head);
    }

}

class Operations {

    void addElements(Node head) {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        System.out.println("Sum : " + sum);
    }

    void reverseList(Node head) {
        Node temp = head;
        if (head == null)
            return;
        else {
            // System.out.print(temp.data + " -> ");
            // reverseList(temp.next);

            // In reversed Order

            reverseList(temp.next);
            System.out.print(temp.data + " -> ");

        }
    }

}
