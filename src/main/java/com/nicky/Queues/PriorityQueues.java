package com.nicky.Queues;

import java.util.Arrays;

public class PriorityQueues {
    private int[] items;
    private int count;

    public PriorityQueues(int capacity){
        items=new int[capacity];
    }

    public void enqueue(int item){
        //shifting elements
        int i;
        for (i=count-1; i>=0; i--){
            if (items[i] > item){
                items[i+1]=items[i];
            }else{
                break;
            }
        }
        items[i+1]=item;
        count++;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
