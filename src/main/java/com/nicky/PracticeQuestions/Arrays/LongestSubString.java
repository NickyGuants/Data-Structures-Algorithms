package com.nicky.PracticeQuestions.Arrays;

public class LongestSubString {
    public static int lengthOfLongestSubstr(String s){
        int max_length = Integer.MIN_VALUE;
        int window_start=0;
        int windowLen=0;
        for (int windowEnd=0; windowEnd<s.length(); windowEnd++){
            windowLen=windowEnd-window_start;
            max_length=Math.max(windowLen, max_length);
        }

        return max_length;
    }

    public static void main(String [] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstr(s));
    }
}
