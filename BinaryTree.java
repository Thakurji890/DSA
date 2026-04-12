package DSA;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static void main(String[] args) {
        int[] nodes = { 10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Tree var = new Tree();
        Node root = var.binaryTreeBuild(nodes);
        System.out.println("Root node Data : " + root.data);

        System.out.println("--- PREORDER TRAVERSAL ---");
        var.preOrder(root);
        System.out.println("\n--- INORDER TRAVERSAL ---");
        var.inOrder(root);
        System.out.println("\n--- POSTORDER TRAVERSAL ---");
        var.postOrder(root);

        System.out.println("\n -- Level Wise Traversal --");
        var.levelTravel(root);
    }
}

class Node {
    int data;
    Node left = null;
    Node right = null;
}

class Tree {

    int idx = -1;

    Node binaryTreeBuild(int[] nodes) {
        idx++;
        if (nodes[idx] == -1)
            return null;

        Node node = new Node();
        node.data = nodes[idx];

        node.left = binaryTreeBuild(nodes);
        node.right = binaryTreeBuild(nodes);

        return node;
    }

    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Level wise traversal / bfs traversal
    void levelTravel(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }
    }

}
