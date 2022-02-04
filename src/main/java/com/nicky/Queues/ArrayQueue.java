package com.nicky.Queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int count;
    private int first;

    public ArrayQueue(int capacity){
        items= new int[capacity];
    }

    //add items to the queue
    public void enqueue(int item){
        if(count == items.length)
            throw new IllegalStateException();
        items[rear]=item;
        rear=(rear+1) % items.length; //circular arrays
        count++;
    }

    //remove elements from the queue
    public int dequeue(){
        var item= items[first];
        items[first]=0;
        first=(first+1) &items.length; //circular arrays
        count--;
        return item;
    }

    public Boolean isEmpty(){
        return count==0;
    }

    public int peek(){
        return items[first];
    }

    public Boolean isFull(){
        return items.length==count;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
