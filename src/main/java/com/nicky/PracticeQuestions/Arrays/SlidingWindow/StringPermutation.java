package com.nicky.PracticeQuestions.Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    public static boolean checkIfStringsArePermutations(String str,  String pattern){
        int windowStart=0;
        int counter =0;
        Map<Character, Integer> patternCharMap = new HashMap<>(pattern.length());
        for (int i=0; i<pattern.length(); i++){
            patternCharMap.put(pattern.charAt(i), patternCharMap.getOrDefault(pattern.charAt(i),0)+1);
        }

        for (int windowEnd=0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            if (patternCharMap.containsKey(rightChar)){
                patternCharMap.put(rightChar, patternCharMap.get(rightChar)-1);
                if (patternCharMap.get(rightChar)==0){
                    counter+=1;
                }
            }
            if (counter==patternCharMap.size()){
                return true;
            }
            if(windowEnd >= pattern.length()-1){
                char leftChar = str.charAt(windowStart++);
                if (patternCharMap.containsKey(leftChar)){
                    if (patternCharMap.get(leftChar)==0){
                        counter-=1;
                    }
                    patternCharMap.put(leftChar, patternCharMap.get(leftChar)+1);
                }
            }
        }
        return false;
    }

    public static void main(String [] args){
        String s = "bcdxabcdy";
        String t = "bcdyabcdx";

        String a = "oidbcaf";
        String b= "abc";

        String c= "odicf";
        String d= "dc";

        System.out.println(checkIfStringsArePermutations(s,t));
        System.out.println(checkIfStringsArePermutations(a,b));
        System.out.println(checkIfStringsArePermutations(c,d));
    }
}
