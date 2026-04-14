package DSA;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueClass {
    public static void main(String[] args) {
        // queue array
        // QueueArray var = new QueueArray();

        // Queue Linked List imple.
        // QueueLinkedList var = new QueueLinkedList();

        // var.enQueue(10);
        // var.enQueue(20);
        // var.enQueue(30);
        // var.enQueue(40);
        // var.enQueue(50);
        // var.display();
        // var.deQueue();
        // var.peek();
        // var.display();

        // Queue Implementwation using java collection & framework
        // Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // queue.add(40);
        // queue.add(50);

        // while (!queue.isEmpty()) {
        // System.out.println(queue.peek());
        // queue.remove();
        // }

        Question var = new Question();
        var.QueueImple(10);
        var.QueueImple(20);
        var.QueueImple(30);
        var.QueueImple(40);
        var.QueueImple(60);

        while (!var.isEmpty()) {
            System.out.println(var.peek());
            var.remove();
        }
    }
}

class Question {
    // Queue Implementation using two stacks
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void QueueImple(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.pop();
    }

    int peek() {
        return s1.peek();
    }

    boolean isEmpty() {
        return s1.isEmpty();
    }
}

// Queue Implementation using Array
class QueueArray {
    int[] queue = new int[5];
    int front = -1, rear = -1;
    int size = queue.length;

    void enQueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty())
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = x;
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int data = queue[front];
        if (rear == front)
            front = rear = -1;
        else
            front = (front + 1) % size;

        System.out.println("DeQueued element : " + data);
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element :" + queue[front]);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.println(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();

    }

    boolean isEmpty() {
        return rear == -1 && front == -1;
    }

}

// linked list queue implementation
class QueueLinkedList {
    class Node {
        int data;
        Node next = null;
    }

    Node head = null;
    Node tail = null;

    void enQueue(int data) {
        Node node = new Node();
        node.data = data;

        if (isEmpty()) {
            head = tail = node;
        }
        tail.next = node;
        tail = node;
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("DeQueued Element : " + head.data);
        head = head.next;
        if (head == null)
            tail = null;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Peek Element : " + head.data);
    }

    boolean isEmpty() {
        return head == null;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
