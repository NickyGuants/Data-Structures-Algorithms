package com.nicky.PracticeQuestions.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public Boolean isAnagram(String s, String t){
        //Check the length of the two strings.
        if(s.length() != t.length()) return false;

        //create a hashmap
        HashMap<Character, Integer> map = new HashMap<>();

        //Store the characters of string s in a hashmap that where the key is the character and the value is the
        //number of times that character appears.
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        //Iterate over the second string and check if each character exists in our hashmap, if it exists,
        //we decrement the value.
        for (int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
        }
        //create a set to hold all the keys or characters in our hashmap
        Set<Character> keys = map.keySet();
        //For each character, check if its value is zero or not. If all keys have zero values left, then the strings are anagrams
        //otherwise they are not.
        for (Character key: keys){
            if(map.get(key) !=0){
                return false;
            }
        }
        return true;
    }

    //use the sorting approach
    public Boolean isAnagramSort(String s, String t){
        //sort
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        //compare
        for(int i=0; i<s.length(); i++){
            if (sChar[i] != tChar[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String [] args){
        ValidAnagram validAnagram = new ValidAnagram();
//        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
//        System.out.println(validAnagram.isAnagram("rat", "cart"));
        System.out.println(validAnagram.isAnagramSort("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagramSort("rat", "cart"));
    }
}
