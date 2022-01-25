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

    public void addLast(int item){
        //create a new node
        Node node = new Node(item);
        //check for the edge case
        if(head==null){
            head=node;
            tail=node;
            count++;
        }else{
            tail.next=node;
            tail= node;
            count++;
        }
    }

    public void deleteFirst(){
        if(head==null){
            throw new NullPointerException();
        }
        head= head.next;
        count--;
    }

    public void deleteLast(){
        Node prevNode= getPreviousNode(tail);
        if(prevNode==null){
            throw new NullPointerException();
        }
        tail=prevNode;
        prevNode.next=null;
        count--;
    }

    public int indexOf(int item){
        Node current = head;
        int index=0;
        if (isEmpty()){
            throw new NullPointerException();
        }
        while (current != null){
            if(current.value==item){
                return index;
            }
            current=current.next;
            index++;
        }
        return -1;
    }
    public Boolean contains(int value){
        Node current = head;
        if(head==null){
            throw new NullPointerException();
        }
        while (current != null){
            if(current.value==value) {
                return true;
            }
            current= current.next;
        }
        return false;
    }

    private Node getPreviousNode(Node node){
        Node current = head;
        while (current !=null){
            if(current.next==node) {
                return current;
            }
            current=current.next;
        }
        return null;
    }

    private Boolean isEmpty(){
        return head ==null;
    }
    public void print(){
        Node temp=head;
        if(head==null){
            throw new NullPointerException();
        }
        while (temp != null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
