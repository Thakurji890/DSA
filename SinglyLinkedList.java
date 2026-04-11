package DSA;

public class SinglyLinkedList {
    public static void main(String[] args) {
        Operations var = new Operations();
        var.addAtBeg(10);
        var.addAtBeg(20);
        var.addAtBeg(30);
        // var.display();
        var.addAtLast(10);
        var.addAtLast(20);
        var.addAtLast(30);
        var.display();
        // var.deleteFromBeg();
        // var.display();
        // // var.deleteFromLast();
        // var.display();
        // var.reverseIterative();
        // var.display();
        // var.deleteNFromLast(5);
    }
}

class Node {
    int data;
    Node next = null;
}

class Operations {
    Node head = null;

    void addAtBeg(int x) {
        Node node = new Node();
        node.data = x;

        if (head == null)
            head = node;
        else {
            node.next = head;
            head = node;
        }
    }

    void deleteFromBeg() {
        if (head == null) {
            System.out.println(head);
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;

    }

    void addAtLast(int x) {
        Node node = new Node();
        node.data = x;

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

    void deleteFromLast() {
        if (head == null) {
            System.out.println(head);
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node curreNode = head.next;

        while (curreNode != null) {
            Node nextNode = curreNode.next;
            curreNode.next = prevNode;

            prevNode = curreNode;
            curreNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    void reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        reverseRecursive(temp.next);
        System.out.print(temp.data + " -> ");
    }

    // LeetCode
    void deleteNFromLast(int n) {
        if (head.next == null || head == null)
            return;

        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        int indexToSearch = size - n;
        int i = 1;
        Node prevNode = head;
        while (i < indexToSearch) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        System.out.println("From last");
        display();
    }

}
