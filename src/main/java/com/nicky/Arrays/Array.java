package com.nicky.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items= new int[length];
        count=0;
    }

    //methods to manipulate the Dynamic array
    //insert an element at the end of the array
    //Time complexity O(1)
    public void insert(int value){
        //check if array is full
        if(isFull()){
           createNewArray();
        }
        items[count]=value;
        count++;
    }

    //Insert an element at the middle(anywhere but the last index)
    //Time complexity O(n)
    public void insertMiddle(int value, int index){
        if (isFull()){
            createNewArray();
        }
        for(int i=count; i>index; i--){
            items[i]=items[i-1];
        }
        items[index]=value;
        count++;
    }

    //Remove an element
    //Time Complexity O(n)
    public void removeAt(int index){
        if(index < 0 || index >=count){
            throw new IllegalArgumentException();
        }
        for (int i=index; i< count; i++){
                items[i]=items[i+1];
        }
        count--;
    }

    //search by value (Find the index of a certain value)
    //Time complexity O(n)
    public int indexOf(int value){
        for(int i=0; i< items.length; i++){
            if(items[i]==value){
                return i;
            }
        }
        return -1;
    }

    //Return true or false if value exists
    //Time complexity O(n)
    public Boolean contains(int value){
        for (int i=0; i< items.length; i++){
            if(items[i]==value){
                return true;
            }
        }
       return false;
    }

    //private methods to check if the array is full and creating a new larger array.
    private Boolean isFull(){
        return count == items.length;
    }
    private void createNewArray(){
        int [] newItems= new int[count*2];
        //copy elements from old array to new array
        for(int i=0; i< items.length; i++){
            newItems[i]=items[i];
        }
        items=newItems;
    }
    //implement a method to print out the array elements
    public void print(){
        //Iterate over the array and print each element
        //Time complexity = 0(n)
        for(int i =0; i< items.length; i++){
            System.out.println(items[i]);
        }
    }

}
