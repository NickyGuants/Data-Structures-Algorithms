package com.nicky.PracticeQuestions.Arrays;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        //convert s to lowercase and remove special characters, spaces, and numbers
        int start=0;
        int end = s.length()-1;
        while(start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String [] args){
        String str ="bccb";
        String str1 ="babc";
        System.out.println(isPalindrome(str));
        //System.out.println(isPalindrome(str1));
    }
}
