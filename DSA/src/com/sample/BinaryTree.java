package com.sample;

public class BinaryTree {

    Node root;

    public void insert(int data) {
        // if (root == null) {
        // root = new Node(data);
        // } else if (data < root.data) {
        // root.left.data = data;
        // } else {
        // root.right.data = data;
        // }
        root = insertrec(root, data);
    }

    public Node insertrec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertrec(root.left, data);
        } else if (data > root.data) {
            root.right = insertrec(root.right, data);
        }
        return root;
    }

    // @note Inorder Treversal
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // @note Posrorder Treversal
    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // @note PreOrder Treversal
    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
}
