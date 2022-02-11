package com.nicky.PracticeQuestions.Arrays;

public class minSubArraySum {
    //Brute force approach
    public static int minSubArrayLen(int target, int[] nums){
        int min_len = Integer.MAX_VALUE;
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

    public static int minLen(int target, int[] nums){
        int min_len = Integer.MAX_VALUE;
        int windowStart=0;
        int current_sum=0;

        for (int windowEnd=0; windowEnd<nums.length; windowEnd++){
            current_sum+=nums[windowEnd];
            while (current_sum>=target){
                min_len=Math.min(min_len, windowEnd-windowStart+1);
                current_sum -=nums[windowStart++];
            }
        }
        return min_len == Integer.MAX_VALUE ? 0: min_len;
    }

    public static void main(String [] args){
        int [] nums={1,2,2};
        //System.out.println(minSubArrayLen(5, nums));
        System.out.println(minLen(6, nums));
    }
}
