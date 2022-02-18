package com.nicky.PracticeQuestions.LinkedLists;

public class MyLinkedList {
    Node head;
    int length =0;
    //create the node
    public class Node{
        int val;
        Node next;

        public Node(int item){
            this.val=item;
        }
    }

    public void insertAtHead(int value){
        Node newHead = new Node(value);
        newHead.next=head;
        head=newHead;
        length++;
    }

    public int get(int index){
        Node current = head;
        int count=0;
        while (current != null){
            if(count == index){
                return current.val;
            }
            current=current.next;
            count++;
        }
        return -1;
    }

    public void addAtTail(int val){
        Node current = head;

        if (head==null){
            head=new Node(val);
        }

        while (current.next != null){
            current=current.next;
        }
        current.next= new Node(val);
        length++;
    }

    public void addAtIndex(int index, int val){
        Node slow=head;
        Node fast = head.next;
        Node node = new Node(val);
        int count=0;
        if (index==length){
            addAtTail(val);
            return;
        }
        if (index>length){
            return;
        }
        if (index==0){
            insertAtHead(val);
            return;
        }

        while (fast != null){
            if (count==index){
                slow.next=node;
                node.next=fast;
                length++;
            }
            fast=fast.next;
            slow=slow.next;
            count++;
        }
    }

    public void deleteAt(int index){
        Node slow=head;
        Node fast = head.next;
        int count =0;
        if (index<0 && index>length ){
            throw new IllegalStateException();
        }
        while (fast != null){
            if (count==index){
                slow.next=fast.next;
                length--;
            }
            fast=fast.next;
            slow=slow.next;
            count++;
        }

    }

    public static void main(String [] args){
        MyLinkedList list = new MyLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.addAtTail(15);
        list.addAtTail(25);
        list.addAtIndex(4, 30);
        list.deleteAt(3);
        //System.out.println(list.get(1));
        System.out.println("Done");
    }
}