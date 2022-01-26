package com.nicky.Arrays;

public class Main {
    public static void main (String[] args){
        //Testing the insert method
        Array numbers = new Array(4);
        numbers.insert(1);
        numbers.insert(2);
//        numbers.insertMiddle(15,1);
//        numbers.insertMiddle(5, 0);
        numbers.insert(3);
        numbers.insert(4);
//        numbers.insert(5);
        //numbers.removeAt(5);

//        System.out.println(numbers.indexOf(25));
//        System.out.println(numbers.contains(25));
        numbers.reverse();
        numbers.print();
    }
}
