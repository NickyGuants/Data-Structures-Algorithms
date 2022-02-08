package com.nicky.HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String [] args){
        //key
        //value
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Nicky");
//        map.put(2, "Guantai");
//        map.put(3,"Tembe");
//        map.put(4, "Tembe");
//        var val = map.get(3);
//
//        System.out.println(map.containsValue("Tembe"));
//        for (var item: map.entrySet()){
//            System.out.println(item.getValue());
//        }

        System.out.println(findNonRepeatingChar("green apple"));
        System.out.println(firstRepeatingChr("Green apple"));

        Set<Integer> set = new HashSet<>();
        int[] numbers={1,2,3,4,4,5,5,6,6,1,2,3,4};
        for (var num: numbers){
            set.add(num);
        }
        //System.out.println(set);
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
