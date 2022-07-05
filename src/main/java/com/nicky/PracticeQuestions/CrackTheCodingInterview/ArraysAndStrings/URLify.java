package com.nicky.PracticeQuestions.CrackTheCodingInterview.ArraysAndStrings;

import java.util.Arrays;

public class URLify {
    public static String urlify(char[] str, int trueLength){
        //count the number of spaces
        int space_count=0;
        for (int i=0; i<trueLength; i++){
            if (str[i]==' '){
                space_count++;
            }
        }
        //find the new length of the string
        int index = trueLength + (space_count*2);
        if (trueLength < str.length) str[trueLength] ='\0';
        for (int i=trueLength-1; i>=0; i-- ){
            if (str[i] ==' '){
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index-=3;
            }else {
                str[index-1] = str[i];
                index--;
            }
        }
        return Arrays.toString(str);
    }

    public static void main(String [] args){
        String str = "Mr John Smith    ";
        System.out.println(urlify(str.toCharArray(), 13));
    }
}
