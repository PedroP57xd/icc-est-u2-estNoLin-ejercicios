package main.Ejercicio_01_insert;

public class InsertBST {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    Node root;

    public Node insert(Node root,int val) {
        return insertRec(root, val);
    }

    private Node insertRec(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.val) {
            node.left = insertRec(node.left, val);
        } else if (val > node.val) {
            node.right = insertRec(node.right, val);
        }
        return node;
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Node node, int level) {
        if (node == null) return;
        printTree(node.right, level + 1);
        System.out.println("  ".repeat(level) + node.val);
        printTree(node.left, level + 1);
    }
}
