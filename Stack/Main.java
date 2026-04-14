import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution var = new Solution();
        int count = 0;
        while (true) {
            int x = sc.nextInt();
            if (x == -1)
                break;
            var.addElement(x);
            count++;
        }
        sc.close();
        var.display();
        System.out.println("Middle Element of Linked List : " + var.middleNode(count));
    }
}

class Node {
    int value;
    Node next;
}

class Solution {
    Node head = null;

    void addElement(int x) {
        Node node = new Node();
        node.value = x;
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

    // int middleNode(int count) {
    // Node temp = head;
    // if (count % 2 != 0) {
    // int pos = 0;
    // while (pos != (count / 2) + 1) {
    // temp = temp.next;
    // pos++;
    // }
    // } else {
    // int pos = 0;
    // while (pos != (count / 2)) {
    // temp = temp.next;
    // pos++;
    // }
    // }
    // return temp.value;
    // }
    int middleNode(int count) {
        Node temp = head;

        int mid = count / 2;
        int pos = 0;

        while (pos < mid) {
            temp = temp.next;
            pos++;
        }

        return temp.value;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }
}
