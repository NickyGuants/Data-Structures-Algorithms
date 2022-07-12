package com.nicky.PracticeQuestions.CrackTheCodingInterview.ArraysAndStrings;

public class StringCompression {
    public static String compressString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        int countConsecutive=0;
        for(int i=0; i<str.length(); i++){
            countConsecutive++;
            if (i+1>= str.length() || str.charAt(i) != str.charAt(i+1)){
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(countConsecutive);
                countConsecutive=0;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String [] args){
        String str = "aabccccaaa";
        System.out.println(compressString(str.toLowerCase()));
    }
}
