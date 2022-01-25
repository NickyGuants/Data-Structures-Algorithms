package com.nicky.LinkedList;

public class Main {
    public static void main(String [] args){
        LinkedLists list = new LinkedLists();
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(15);
        list.addLast(20);
        list.deleteFirst();
        list.print();
    }
}
