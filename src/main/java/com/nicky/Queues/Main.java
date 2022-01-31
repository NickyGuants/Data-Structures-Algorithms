package com.nicky.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String [] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        Main.reverse(queue);

        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        //create a stack
        Stack<Integer> stack = new Stack<>();
        if (queue.isEmpty()) throw new NullPointerException();
        for(int i=0; i< queue.size(); i++){
          stack.push(queue.remove());
        }

        while (!stack.empty()){
            queue.add(stack.pop());
        }
    }
}
