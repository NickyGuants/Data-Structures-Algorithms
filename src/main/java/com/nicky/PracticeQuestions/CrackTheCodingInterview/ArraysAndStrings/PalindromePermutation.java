package com.nicky.PracticeQuestions.CrackTheCodingInterview.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String str){
        Set<Character> characterSet = new HashSet<>();

        for (char ch: str.toLowerCase().toCharArray()) {
            if (!characterSet.contains(ch)){
                characterSet.add(ch);
            }else {
                characterSet.remove(ch);
            }
        }
        return characterSet.size() <=1;
    }

    public static void main(String [] args){
        String str = "Racecar";
        String str1 = "code";

        System.out.println(isPalindromePermutation(str));
        System.out.println(isPalindromePermutation(str1));
    }
}
