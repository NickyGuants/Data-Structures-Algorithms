package com.nicky.PracticeQuestions.Arrays;

public class minSubArraySum {
    //Brute force approach
    public static int minSubArrayLen(int target, int[] nums){
        int min_len = 0;
        for(int i=0; i< nums.length; i++){
            int current_sum = nums[i];
            if (current_sum >=target) return 1;
            for (int j=i+1; j<nums.length; j++){
                current_sum +=nums[j];
                if (current_sum >= target){
                    min_len=j-i+1;
                }
            }
        }
        return min_len;
    }



    public static void main(String [] args){
        int [] nums={3,1,1,2,3,4};
        System.out.println(minSubArrayLen(5, nums));
    }
}
