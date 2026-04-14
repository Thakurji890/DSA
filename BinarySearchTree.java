package DSA;

import java.util.ArrayList;

public class BinarySearchTree {
    public static void main(String[] args) {
        Operations var = new Operations();
        int[] nodes = { 10, 5, 6, 4, 1, 3, 8, 11, 14 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = var.buildBST(root, nodes[i]);
        }
        System.out.println("\nInorder Traversal : ");
        var.inOrder(root);
        int key = 90;
        System.out.println("\nElemennt Found : ");
        System.out.println(var.searchBST(root, key) ? "TRUE" : "FALSE");

        var.delete(root, 1);
        System.out.println("\nInorder Traversal : ");
        var.inOrder(root);
        System.out.println("\nPrinting Range : ");
        var.printInRange(root, 1, 6);
        System.out.println();

        var.printRootToLeaf(root, new ArrayList<>());
    }
}

class Node {
    int data;
    Node left = null;
    Node right = null;

    Node(int val) {
        this.data = val;
    }
}

class Operations {

    Node buildBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    Node delete(Node root, int val) {

        if (root.data < val)
            root.right = delete(root.right, val);
        else if (root.data > val)
            root.left = delete(root.left, val);
        else {
            // root.data == val
            // case 1
            if (root.left == null && root.right == null)
                return null;

            // case 2
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;

    }

    Node inorderSuccessor(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    boolean searchBST(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        else if (root.data > key)
            return searchBST(root.left, key);
        else if (root.data < key)
            return searchBST(root.right, key);
        else
            return false;
    }

    void printInRange(Node root, int x, int y) {
        if (root == null)
            return;
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y)
            printInRange(root.left, x, y);
        else
            printInRange(root.right, x, y);
    }

    void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;
        path.add(root.data);
        if (root.left == null && root.right == null)
            printPath(path);
        else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
    }

    void printPath(ArrayList<Integer> path) {
        System.out.println("\nPaths : ");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
}