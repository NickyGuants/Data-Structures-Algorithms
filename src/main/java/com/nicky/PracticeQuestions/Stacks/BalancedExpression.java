package com.nicky.PracticeQuestions.Stacks;

import java.util.Stack;

public class BalancedExpression {

    public Boolean isBalancedExpression(String str){
        Stack<Character> stack = new Stack<>();

       for(int i=0; i<str.length(); i++){
           if(str.charAt(i)=='(' || str.charAt(i)=='{'){
               stack.push(str.charAt(i));
           }
           if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i)==']'){
               if (stack.empty()) return false;
               char top =stack.pop();
               if( (str.charAt(i)==')' && top != '(') || (str.charAt(i)=='}' && top != '{') || (str.charAt(i)==']' && top != '['))
                   return false;
           }
       }
       return stack.empty();
    }

//    public Boolean match(char ch){
//        if (ch=='')
//    }

    public static void main(String [] args){
        BalancedExpression balancedExpression = new BalancedExpression();
        System.out.println(balancedExpression.isBalancedExpression("()"));
        System.out.println(balancedExpression.isBalancedExpression("({))"));
        System.out.println(balancedExpression.isBalancedExpression("({))"));
        System.out.println(balancedExpression.isBalancedExpression("()[]{}"));
    }
}
