package com.nicky.PracticeQuestions.Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public static int minimumWindowSubstring(String s, String t){
        int minLength = s.length();
        int windowStart =0;
        int counter = t.length();
        Map<Character, Integer> reqCharMap = new HashMap<>(t.length());

        for(int i=0; i<t.length(); i++){
            reqCharMap.put(t.charAt(i), 1);
        }

        for (int windowEnd=0; windowEnd<s.length(); windowEnd++){
            char rightChar= s.charAt(windowEnd);
            if (reqCharMap.containsKey(rightChar)){
                if (reqCharMap.get(rightChar) >0){
                    counter -=1;
                }
                reqCharMap.put(rightChar, reqCharMap.get(rightChar)-1);
            }

            //when we get a valid window, we start shrinking the window after calculating its length
            while(counter == 0){
                minLength = Math.min(minLength, windowEnd-windowStart+1);
                char leftChar = s.charAt(windowStart);
                if (reqCharMap.containsKey(leftChar)){
                    reqCharMap.put(leftChar, reqCharMap.get(leftChar)+1);
                    if(reqCharMap.get(leftChar)>0){
                        counter+=1;
                    }
                }
                windowStart++;
            }

        }
        return minLength;
    }

    public static void main(String [] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String a= "HGFDSAXZBJKC";
        String b = "ABKC";

        System.out.println(minimumWindowSubstring(s,t));
        System.out.println(minimumWindowSubstring(a,b));
    }
}
