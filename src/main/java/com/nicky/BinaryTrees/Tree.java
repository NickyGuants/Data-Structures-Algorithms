package com.nicky.BinaryTrees;

public class Tree {
    private Node root;

    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value){
        //find the position where to insert
        var node = new Node(value);
        if(root == null){
            root=node;
            return;
        }
        var current = root;

        while (true){
            if(value < current.value){
                if (current.left == null){
                    current.left=node;
                    break;
                }
                current=current.left;
            }else{
                if (current.right==null){
                    current.right=node;
                    break;
                }
                current=current.right;
            }
        }
    }

    public boolean find(int value){
        var current = root;
        if (root==null){
            return false;
        }

        while (current != null){
            if (value <current.value){
                current=current.left;
            }else if(value > current.value){
                current=current.right;
            }else {
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }
    public void traverseInOrder(){
        traverseInOrder(root);
    }
    public void traversePostOrder(){
        traversePostOrder(root);
    }

    public int height(){
        return height(root);
    }
    private void traversePreOrder(Node root){
        //base condition
        if (root == null) return;
        //visit root(print)
        //visit left and the right.
        //use recursion in step 2.(call the method on itself.
        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    private void traverseInOrder(Node root){
        //base condition
        if (root == null) return;
        traverseInOrder(root.left);
        System.out.println(root.value);
        traverseInOrder(root.right);
    }

    private void traversePostOrder(Node root){
        if (root == null) return;

        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.println(root.value);
    }

    private int height(Node root){
        if (root== null) return -1;

        if (root.left == null && root.right==null) return 0;

        return 1+Math.max(height(root.left), height(root.right));
    }
}
