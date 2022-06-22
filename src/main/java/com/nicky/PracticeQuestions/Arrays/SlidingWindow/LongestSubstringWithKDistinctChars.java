package com.nicky.PracticeQuestions.Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctChars {
    public static int longestSubstringKDistinct(String str, int k){
        int maxLength = 0;
        int windowStart = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int windowEnd=0; windowEnd<str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0)+1);
            while (charFrequencyMap.size()>k){
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar)-1);
                if (charFrequencyMap.get(leftChar)==0){
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++;
            }
            maxLength= Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }

    public static void main(String [] args){
        String str = "AAAHHIBC";
        String str1 = "PWWKEW";

        int k1=2;

        System.out.println(longestSubstringKDistinct(str,k1));
        System.out.println(longestSubstringKDistinct(str1,k1));
    }
}
