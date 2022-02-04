package com.nicky.Queues;

import java.util.Stack;

public class QueueStacks {
    //create two stacks
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2= new Stack<>();

    //we add to the first stack
    //Time complexity O(1)
    public void enqueue(int item){
        stack1.push(item);
    }

    //Time complexity O(n)
    public int dequeue(){
        //the queue is empty
        if (isEmpty()) throw new IllegalStateException();

        if (stack2.isEmpty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public Boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
