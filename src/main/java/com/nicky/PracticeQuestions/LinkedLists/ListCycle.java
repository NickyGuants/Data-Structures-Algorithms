package com.nicky.PracticeQuestions.LinkedLists;

public class ListCycle {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }}

    public static Boolean hasCycle (ListNode head){
       ListNode slow=head;
       ListNode fast = head;

       //no items in the list so no cycle
       if (head == null) return false;
       //just one node in the list so no cycle
       if (head.next == null) return false;
       while (fast != null && fast.next != null){
           slow=slow.next;
           fast=fast.next.next;
           if (slow==fast){
               return true;
           }
       }
    return false;
    }

    public static void main(String [] args){
        ListNode listNode = new ListNode(30);

        System.out.println(hasCycle(listNode));
    }
}
