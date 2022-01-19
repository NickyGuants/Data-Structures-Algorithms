package com.nicky.LinkedList;

public class LinkedLists {

    private class Node{
        private int value;
        private Node next;
        private Node (int value){
            this.value=value;
        }
    }

    private Node head;
    private Node tail;
    private int count;


    public void addFirst(int item){
        Node node = new Node(item);
        if(head==null){
            head=node;
            tail=node;
            count++;
        }else{
            node.next=head;
            head=node;
            count++;
        }

    }
}
