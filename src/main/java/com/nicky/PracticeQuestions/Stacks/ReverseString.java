package com.nicky.PracticeQuestions.Stacks;

import java.util.Stack;

public class ReverseString {

    //using string concatenation
    public String reverseString (String str){
        Stack<Character> stack = new Stack<>();
        String reversed="";

        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
       }
        while (!stack.isEmpty()){
            reversed +=stack.pop();
        }

        return reversed;
    }
    //using string builder to reduce concatenations in a loop
    public String reverser (String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String [] args){
        ReverseString reverseString = new ReverseString();
        String reversed= reverseString.reverseString("hello");
        System.out.println(reversed);
        System.out.println(reverseString.reverser("Nicky"));
    }

}
