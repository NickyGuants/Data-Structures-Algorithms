package com.nicky.PracticeQuestions.CrackTheCodingInterview.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    //using a set
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

    //using a character array
    public static boolean isPalindromePermutationUsingArr(String str){
        int[] char_counts = new int[128];
        for (int i=0; i< str.length(); i++){
            char_counts[str.charAt(i)]++;
        }

        int count =0;
        for (int i=0; i<128; i++){
            count+=char_counts[i] %2;
        }

        return count<=1;
    }


    public static void main(String [] args){
        String str = "racecar";
        String str1 = "code";

//        System.out.println(isPalindromePermutation(str));
//        System.out.println(isPalindromePermutation(str1));
        System.out.println(isPalindromePermutationUsingArr(str));
    }
}
