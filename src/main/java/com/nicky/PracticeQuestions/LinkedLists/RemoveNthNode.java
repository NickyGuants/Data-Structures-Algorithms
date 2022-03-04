package com.nicky.PracticeQuestions.LinkedLists;

//remove nth node from end of the list.
public class RemoveNthNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }

    public static ListNode removeNthNodeFromEnd(ListNode head, int n){
        ListNode slow= head;
        ListNode fast = head;

        if (head.next != null) return head;

        for (int i=0; i<n; i++){
            fast=fast.next;
        }

        while (fast.next !=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return head;
    }
}
