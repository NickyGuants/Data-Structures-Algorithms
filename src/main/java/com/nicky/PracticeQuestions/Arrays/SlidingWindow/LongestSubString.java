package com.nicky.PracticeQuestions.Arrays.SlidingWindow;

import java.util.HashSet;

public class LongestSubString {
    public static int lengthOfLongestSubstr(String s){
        int max_length = 0;
        int window_start=0;
        int window_end=0;
        HashSet<Character> uniqueset = new HashSet<>();
        while (window_end<s.length()){
            if (!uniqueset.contains(s.charAt(window_end))){
                uniqueset.add(s.charAt(window_end));
                window_end++;
                max_length=Math.max(max_length, window_end-window_start);
            }else{
                uniqueset.remove(s.charAt(window_start));//0(1)
                window_start++;
            }
        }
      return max_length;
    }

    public static void main(String [] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstr(s));
    }
}
