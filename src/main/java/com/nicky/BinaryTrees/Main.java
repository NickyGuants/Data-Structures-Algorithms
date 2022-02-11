package com.nicky.BinaryTrees;

public class Main {

    public static void main(String [] args){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

//        System.out.println(tree.find(13));
//        System.out.println(tree);
        //System.out.println(factorial(4));
        //tree.traversePreOrder();
        //tree.traverseInOrder();
//        tree.traversePostOrder();

        System.out.println(tree.height());

    }

    public static int factorial(int n){
        //using a loop
        int factorial = 1;
//        for (int i=n; i>1; i--){
//            factorial*=i;
//        }

        //using recursion (n* (n-1)!
        //base condition
        if(n==0) return 1;
        factorial =n * factorial(n-1);
        return factorial;
    }
}
