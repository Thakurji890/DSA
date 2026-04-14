package ExamProb;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackOperations var = new StackOperations();

        var.push(10);
        var.push(20);
        var.push(30);
        var.display();
        System.out.println("Top Element is : " + var.peek());
        var.pop();
        var.pop();
        var.display();

        sc.close();
    }
}

class Node {
    int data;
    Node next;
}

class StackOperations {
    Node top = null;

    void push(int x) {

        Node node = new Node();
        node.data = x;
        node.next = null;

        if (top == null)
            top = node;
        else {
            Node temp = top;
            top = node;
            top.next = temp;
        }
    }

    int peek() {
        if (top == null)
            return -1;
        return top.data;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow.");
            return;
        }
        Node temp = top;
        top = temp.next;
        // System.out.println("Element : " + temp.data);
        temp = null;

    }

    void display() {
        if (top == null)
            return;
        Node temp = top;
        System.out.print("TOP -> ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
