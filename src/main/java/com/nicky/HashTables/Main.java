package com.nicky.HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String [] args){
//
//        System.out.println(findNonRepeatingChar("green apple"));
//        System.out.println(firstRepeatingChr("Green apple"));
//
//        Set<Integer> set = new HashSet<>();
//        int[] numbers={1,2,3,4,4,5,5,6,6,1,2,3,4};
//        for (var num: numbers){
//            set.add(num);
//        }

        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "D");
        table.remove(6);

        System.out.println("Done");
    }

    public static char findNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars =str.toCharArray();
        for (var ch: chars){
            if(map.containsKey(ch)){
               map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 0);}
        }

        for (char ch: chars){
            if (map.get(ch)==0){
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    public static char firstRepeatingChr(String str){
        Set<Character> set = new HashSet<>();

        for (char ch: str.toCharArray()){
            if (set.contains(ch)) return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }

}
