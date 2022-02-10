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


}
