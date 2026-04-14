package LinkedList;

public class Doubly {
    public static void main(String[] args) {
        DoublyLinkedList var = new DoublyLinkedList();
        var.addAtBeg(10);
        var.addAtBeg(20);
        var.addAtBeg(30);
        var.addAtBeg(40);
        var.addAtBeg(50);
        var.display();
    }
}
// Leetcode 876

class Node {
    Node prev;
    int data;
    Node next;
}

class DoublyLinkedList {
    Node head = null;

    void addAtBeg(int data) {
        Node node = new Node();
        node.data = data;
        node.next = node.prev = null;
        if (head == null)
            head = node;
        else {
            head.prev = node;
            node.next = head;
        }
    }

    void delAtBeg() {

    }

    void addAtLast(int data) {

    }

    void delAtLast() {

    }

    void addAtPos(int data, int pos) {

    }

    void delAtPos(int pos) {

    }

    void display() {

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
// }while(var != -1);

// l1.display();

// l1.deleteAtBeg();
// l1.display();

// l1.deleteAtEnd();
// l1.display();
// }
// }

// class Node {
// Node prev;
// int data;
// Node next;
// }

// class LinkedList {
// Node head = null;

// void insertAtBeg(int x) {
// // Creation of Node
// Node nn = new Node();

// // Definition of Node
// nn.data = x;
// nn.next = head;
// nn.prev = null;

// // Connection of Node
// if(head != null)
// head.prev = nn;

// head = nn;
// }

// void insertAtEnd(int x) {
// // Creation of Node
// Node nn = new Node();

// // Definition of Node
// nn.data = x;
// nn.next = null;
// nn.prev = null;

// // Connection of Node
// if(head == null)
// head = nn;
// else {
// Node temp = head;

// while(temp.next != null)
// temp = temp.next;

// temp.next = nn;
// nn.prev = temp;
// }
// }

// void deleteAtBeg() {
// if(head == null)
// return;
// else if(head.next == null) {
// Node temp = head;
// head = null;
// temp = null;
// }
// else {
// Node temp = head;
// head = head.next;
// head.prev = null;
// temp = null;
// }
// }

// void deleteAtEnd() {
// if(head == null)
// return;
// else if(head.next == null) {
// Node temp = head;
// head = null;
// temp = null;
// }
// else {
// Node temp = head;

// while(temp.next.next != null)
// temp = temp.next;

// temp.next = null;
// }
// }

// void display() {
// if(head == null)
// return;

// Node temp = head;

// System.out.print("FW DIRECTION : ");
// while(temp.next != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println(temp.data + " -> NULL");

// System.out.print("BW DIRECTION : ");
// while(temp.prev != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.prev;
// }
// System.out.println(temp.data + " -> NULL\n");
// }
// }