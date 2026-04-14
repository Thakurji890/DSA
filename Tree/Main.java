package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree b = new BinarySearchTree();

        System.out.print("Enter size of Tree : ");
        int n = sc.nextInt();
        int var;

        System.out.println("Enter elements :");

        for (int i = 1; i <= n; i++) {
            var = sc.nextInt();
            b.insert(var);
        }

        System.out.print("In_Order\t: ");
        b.inOrder(b.root);
        System.out.println("\n");

        System.out.print("Pre_Order\t: ");
        b.preOrder(b.root);
        System.out.println("\n");

        System.out.print("Post_Order\t: ");
        b.postOrder(b.root);
        System.out.println("\n");

        sc.close();
    }

}

class Node {
    Node left;
    int data;
    Node right;
}

class BinarySearchTree {
    Node root = null;

    void insert(int x) {
        // Craetion of Node
        Node nn = new Node();

        // Definition of Node
        nn.data = x;
        nn.left = nn.right = null;

        // Connection of Node
        if (root == null)
            root = nn;
        else {
            Node temp = root;

            while (true) {
                if (x < temp.data) { // direction
                    if (temp.left == null) { // availablity
                        temp.left = nn;
                        break;
                    } else
                        temp = temp.left;
                } else {
                    if (temp.right == null) { // availablity
                        temp.right = nn;
                        break;
                    } else
                        temp = temp.right;
                }
            }
        }
    }

    void inOrder(Node temp) {
        if (temp != null) {
            inOrder(temp.left);
            System.out.print(temp.data + " ");
            inOrder(temp.right);
        }
    }

    void preOrder(Node temp) {
        if (temp != null) {
            System.out.print(temp.data + " ");
            preOrder(temp.left);
            preOrder(temp.right);
        }
    }

    void postOrder(Node temp) {
        if (temp != null) {
            postOrder(temp.left);
            postOrder(temp.right);
            System.out.print(temp.data + " ");
        }
    }
}