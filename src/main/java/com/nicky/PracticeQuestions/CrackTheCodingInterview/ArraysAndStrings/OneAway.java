package com.nicky.PracticeQuestions.CrackTheCodingInterview.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class OneAway {
    public static boolean isOneAway(String str1, String str2){
        Map<Character,Integer> characterMap = new HashMap<>();
        int count=0;

        if (Math.abs(str1.length()-str2.length())>1){
            return false;
        }
        for (int i=0; i<str2.length(); i++){
            characterMap.put(str2.charAt(i), characterMap.getOrDefault(str2.charAt(i), 0) +1);
        }

        for (char ch: str1.toCharArray()){
            if (characterMap.containsKey(ch)){
                characterMap.put(ch, characterMap.get(ch)-1);
                if (characterMap.get(ch) == 0){
                    characterMap.remove(ch);
                }
            }else {
                count++;
            }
        }
        System.out.println(count);
        return count <=1;
    }

    public static void main(String [] args){
        String str1 ="pale";
        String str2 ="ple";

        String str3 ="pales";
        String str4 ="pale";

        String str5 ="pale";
        String str6 ="bale";

        String str7 ="pale";
        String str8 ="bake";

        System.out.println(isOneAway(str1,str2));
        System.out.println(isOneAway(str3,str4));
        System.out.println(isOneAway(str5,str6));
        System.out.println(isOneAway(str7,str8));
    }
}
