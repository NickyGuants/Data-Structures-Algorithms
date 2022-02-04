package com.nicky.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String [] args){
        Queue<Integer> queue = new ArrayDeque<>();
        ArrayQueue queue1 = new ArrayQueue(3);
        QueueStacks queueStacks = new QueueStacks();
        PriorityQueues priorityQueues = new PriorityQueues(3);

        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
//        System.out.println( queue1.dequeue());
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        Main.reverse(queue);
//        System.out.println(queue1);
//        System.out.println(queue1.isEmpty());
//        System.out.println(queue1.peek());
//        System.out.println(queue1.isFull());

//        queueStacks.enqueue(10);
//        queueStacks.enqueue(20);
//        queueStacks.enqueue(30);
//        var first = queueStacks.dequeue();
//        System.out.println(first);
        priorityQueues.enqueue(10);
        priorityQueues.enqueue(30);
        priorityQueues.enqueue(20);

        System.out.println(priorityQueues);
    }

    public static void reverse(Queue<Integer> queue){
        //create a stack
        Stack<Integer> stack = new Stack<>();
        if (queue.isEmpty()) throw new NullPointerException();
        while(!queue.isEmpty()){
          stack.push(queue.remove());
        }

        while (!stack.empty()){
            queue.add(stack.pop());
        }
    }
}
