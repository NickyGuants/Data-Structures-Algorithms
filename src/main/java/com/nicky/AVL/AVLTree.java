package com.nicky.AVL;

public class AVLTree {
    private class AVLNode {
        private int value;
        private int height;
        private AVLNode left;
        private AVLNode right;

        public AVLNode(int value){
            this.value=value;
        }

        @Override
        public String toString(){
            return "Value="+this.value;
        }
    }

    private AVLNode root;
    public void insert(int value){
        root= insert(root, value);
    }

    private AVLNode  insert(AVLNode root, int value){
        if (root ==null){
            return new AVLNode(value);
        }
        if (value < root.value){
            root.left =insert(root.left, value); //recursive call
        }else{
            root.right=insert(root.right, value);
        }
        root.height= Math.max(height(root.left), height(root.right)+1);

        //balanceFactor = height(l) - height(r)
        var balanceFactor = balanceFactor(root);
        if (isLeftHeavy(root)){
            System.out.println(root.value+ "is left heavy");
        }else if(isRightHeavy(root)){
            System.out.println(root.value+ "is right heavy");
        }

        return root;
    }

    private boolean isLeftHeavy(AVLNode node){
        return balanceFactor(node) >1;
    }

    private boolean isRightHeavy(AVLNode node){
        return balanceFactor(node) <- 1;
    }

    private int balanceFactor(AVLNode node){
        return (node == null) ? 0: height(node.left) - height(node.right);
    }

    private int height (AVLNode node){
        if (node==null) return -1;
        return node.height;
    }
}
