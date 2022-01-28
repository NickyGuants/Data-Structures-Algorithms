package com.nicky.PracticeQuestions.Arrays;

import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public Boolean isAnagram(String s, String t){
        //Check the length of the two strings.
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        for (int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key: keys){
            if(map.get(key) !=0){
                return false;
            }
        }
        return true;
    }


    public static void main(String [] args){
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("rat", "cart"));
    }
}
