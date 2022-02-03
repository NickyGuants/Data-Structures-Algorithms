package com.nicky.PracticeQuestions.Arrays;

import java.util.Arrays;

//Given an array and a value, remove all instances of that value in-place and return the new length.
public class RemoveElement {
    public static int removeEl(int [] nums, int val){
        int k=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String [] args){
        int[] nums= {1,1,2,2,2} ;
        System.out.println(RemoveElement.removeEl(nums, 1));

    }
}
