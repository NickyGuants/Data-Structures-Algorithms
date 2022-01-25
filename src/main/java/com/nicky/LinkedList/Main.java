package com.nicky.LinkedList;

public class Main {
    public static void main(String [] args){
        LinkedLists list = new LinkedLists();
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(15);
        list.addLast(25);
        //list.addMiddle(20, 2);
//        list.deleteFirst();
//        list.deleteLast();
        list.deleteMiddle(15);
//        System.out.println(list.indexOf(25));
//        System.out.println(list.contains(20));
        list.print();
    }
}
