package DSA;

import java.util.ArrayList;

import java.util.*;;

public class StackClass {
    // This is for fixed array stack implemetation

    // public static void main(String[] args) {
    // StackArray stack = new StackArray();
    // stack.push(10);
    // stack.push(20);
    // stack.peek();
    // stack.pop();
    // stack.peek();
    // }

    // This is variable linked list stack implementation

    // public static void main(String[] args) {
    // StackLinked stack = new StackLinked();
    // stack.push(10);
    // stack.push(20);
    // stack.push(30);
    // stack.display();
    // stack.pop();
    // stack.display();
    // stack.peek();
    // }

    // This is variable array list stack implementation

    // public static void main(String[] args) {
    // StackArrayList stack = new StackArrayList();
    // stack.push(10);
    // stack.push(30);
    // stack.push(40);
    // stack.display();
    // stack.peek();
    // stack.pop();
    // stack.display();
    // stack.peek();
    // }

    // This is for Stack Frameworks

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(33);
        System.out.println(stack.isEmpty());
        stack.pop();
        for (int num : stack) {
            System.out.println(num);
        }
    }
}

class StackArrayList {
    ArrayList<Integer> stack = new ArrayList<>();

    boolean isEmpty() {
        return stack.size() == 0;
    }

    void push(int x) {
        stack.add(x);
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        int top = stack.size() - 1;
        System.out.println("Pop Element : " + stack.get(top));
        stack.remove(top);
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Peek Element : " + stack.get(stack.size() - 1));
    }

    void display() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}

class StackLinked {
    class Node {
        int data;
        Node next = null;
    }

    Node top = null;

    void push(int x) {
        Node node = new Node();
        node.data = x;

        if (isEmpty())
            top = node;
        else {
            node.next = top;
            top = node;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        System.out.println("POPED ELEMENT : " + temp.data);
        top = top.next;
        temp = null;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("PEEK ELEMENT : " + top.data);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    boolean isEmpty() {
        return top == null;
    }
}

class StackArray {
    int top = -1;
    int[] arr = new int[1];

    void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack is OverFlow");
            return;
        }
        arr[++top] = x;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is UnderFlow");
            return;
        }
        System.out.println("Poped Element : " + arr[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Peek Element : " + arr[top]);
    }
}
