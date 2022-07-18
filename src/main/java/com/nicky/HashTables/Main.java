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

//       HashTable table = new HashTable<>();
       int flight_length = 90;
       int[] movie_lengths = {40, 60, 90, 70, 50};

       System.out.println(inflightSys(flight_length, movie_lengths));
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

    public static boolean inflightSys(int flight_length, int[] movie_lengths){
        HashSet movieSet = new HashSet<>();
//        for(int length: movie_lengths){
//            movieSet.add(length);
//        }

        for (int i=0; i< movie_lengths.length; i++){
            if (movieSet.contains(flight_length-movie_lengths[i])){
                return true;
            }
            movieSet.add(movie_lengths[i]);
        }
        return false;
    }
}
