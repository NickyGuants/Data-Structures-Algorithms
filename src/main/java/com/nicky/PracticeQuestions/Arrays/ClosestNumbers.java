package com.nicky.PracticeQuestions.Arrays;

public class ClosestNumbers {
    //brute force
    public static void closestNumbers(int[] nums){
        int min_distance = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                min_distance= Math.min(Math.abs(nums[j]-nums[i]), min_distance);
            }
        }
        System.out.println(min_distance);
    }

    //try using a hashmap to solve the problem

    public static void main(String [] args){
        int[] nums = {6,2,4,10};
        closestNumbers(nums);
    }
}
