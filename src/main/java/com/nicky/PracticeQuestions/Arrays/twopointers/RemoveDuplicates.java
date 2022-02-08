package com.nicky.PracticeQuestions.Arrays.twopointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int k=0;
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return 1;
        }
        for (int i=1; i< nums.length; i++){
            if (nums[k] != nums[i]){
                nums[k++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k+1;
    }

    public static void main(String [] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
