package TCS;

public class ReverseLinkedList {
    public static void main(String[] args) {
        linkedList var = new linkedList();
        var.addLast(10);
        var.addLast(10);
        var.addLast(20);
        var.addLast(30);

        var.display();
        var.reverse();
        var.display();
        var.middleElement();
        var.removeDuplicates();
        var.display();
    }

}

class linkedList {
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
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void reverse() {
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    void middleElement() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    void removeDuplicates() {
        if (head == null)
            return;
        Node curNode = head;

        while (curNode != null && curNode.next != null) {
            if (curNode.data == curNode.next.data) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
    }

}