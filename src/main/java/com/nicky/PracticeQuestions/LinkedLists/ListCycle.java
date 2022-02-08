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
        HashMap<Integer, ListNode> map = new HashMap<>();

        while (head !=null){
            map.put(head.val, head.next);
            head=head.next;
        }

    return false;
    }

    public static void main(String [] args){
        ListCycle listCycle = new ListCycle();
    }
}
