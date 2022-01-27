package com.nicky.PracticeQuestions.Stacks;

import java.util.Stack;

public class BalancedExpression {

    public Boolean isBalancedExpression(String str){
        Stack<Character> stack = new Stack<>();

       for(int i=0; i<str.length(); i++){
           if(str.charAt(i)=='('){
               stack.push(str.charAt(i));
           }
           if(str.charAt(i) == ')'){
               if (stack.empty()) return false;
               char top =stack.pop();
               if( top != '(')
                   return false;
           }
       }
       return stack.empty();
    }

    public static void main(String [] args){
        BalancedExpression balancedExpression = new BalancedExpression();
        System.out.println(balancedExpression.isBalancedExpression("(((1+2))))"));
    }
}
