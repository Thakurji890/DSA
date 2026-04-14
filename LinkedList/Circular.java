package LinkedList;

public class Circular {
    public static void main(String[] args) {
        // CircularOperation var = new CircularOperation();
    }

}

class Node {
    int data;
    Node next;

}

class CircularOperation {
    Node head = null;

    void insertAtBeg(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
    }
}

// import java.util.Scanner;
// public class Main
// {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// LinkedList l1 = new LinkedList();
// int var;

// do {
// var = sc.nextInt();
// l1.insertAtEnd(var);
// } while(var != -1);

// l1.display();

// l1.deleteAtBeg();
// l1.display();

// l1.deleteAtEnd();
// l1.display();
// }
// }

// class Node {
// int data;
// Node next;
// }

// class LinkedList {
// Node head = null, tail = null;

// void insertAtBeg(int x) {
// // Creation of Node
// Node nn = new Node();

// // Definition of Node
// nn.data = x;

// // Connection of Node
// if(head == null) {
// head = nn;
// nn.next = head;
// tail = nn;
// }
// else {
// nn.next = head;
// head = nn;
// tail.next = head;
// }
// }

// void insertAtEnd(int x) {
// // Creation of Node
// Node nn = new Node();

// // Definition of Node
// nn.data = x;

// // Connection of Node
// if(head == null) {
// head = nn;
// nn.next = head;
// }
// else {
// tail.next = nn;
// nn.next = head;
// }
// tail = nn;
// }

// void deleteAtBeg() {
// if(head == null)
// return;
// else if(head == tail)
// head = tail = null;
// else {
// head = head.next;
// tail.next = head;
// }
// }

// void deleteAtEnd() {
// if(head == null)
// return;
// else if(head == tail)
// head = tail = null;
// else {
// Node temp = head;

// while(temp.next != tail)
// temp = temp.next;

// temp.next = head;
// tail = temp;
// }
// }

// void display() {
// if(head == null)
// return;

// Node temp = head;

// while(temp != tail) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }

// System.out.println(tail.data + " -> HEAD...\n");
// }
// }
