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

    public void addMiddle(int item,int position){
        Node node = new Node(item);
        Node current = head;
        int index=0;
        //Traverse the list to the element at position-1
        //O(n^2)
        while (current != null){
            if(index==position){
                Node prevNode =getPreviousNode(current);
                prevNode.next=node;
                node.next=current;
                count++;
            }
            current=current.next;
            index++;
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

    public int nthNode(int n){
        Node current=head;
        Node slower = head;
       for (int i=0; i<n-1; i++){
           current=current.next;
       }
        while (current != tail){
            current = current.next;
            slower = slower.next;
        }
        return slower.value;
    }
    public void removeNthNode(int n){
        Node current=head;
        Node slower = head;
        for (int i=0; i<n; i++){
            current=current.next;
        }
        while (current != tail){
            current = current.next;
            slower = slower.next;
        }
        slower.next=slower.next.next;
    }

    public void deleteMiddle(int item){
        Node current = head;
        while(current.next != null){
            if(current.next.value==item){
                current.next=current.next.next;
                count--;
            }
            current=current.next;
        }
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

    //Time complexity O(n)
    public void reverse(){
        Node current = head;
        Node prev=null;
        Node next;
        while (current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        tail=head;
        head=prev;
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
