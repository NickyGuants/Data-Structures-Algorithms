package com.nicky.Arrays;

public class Main {
    public static void main (String[] args){
        //Testing the insert method
        Array numbers = new Array(1);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insertMiddle(15,1);
        numbers.insertMiddle(5, 0);
        numbers.insert(25);



        numbers.print();
    }
}
