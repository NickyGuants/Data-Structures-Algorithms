package com.nicky.PracticeQuestions.LinkedLists;

import java.util.HashMap;

public class ListCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }}

    public Boolean hasCycle (ListNode head){
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
        ListCycle listCycle = new ListCycle();
    }
}
