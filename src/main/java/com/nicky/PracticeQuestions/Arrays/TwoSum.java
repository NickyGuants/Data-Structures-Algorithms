package com.nicky.PracticeQuestions.Arrays;

import java.util.Arrays;
import java.util.HashMap;

//Java solution for two sum

public class TwoSum {
    //Brute force solution
    //Time complexity O(n^2)
    public int[] twoSum(int [] nums, int target){
        int [] indices = new int[2];
        for(int i=0; i< nums.length; i++){
            for (int j=i; j< nums.length; j++){
                if(nums[i]+nums[j]==target){
                    indices[0]=j;
                    indices[1]=i;
                }
            }
        }
        return indices;
    }
    //using a hashmap
    //Time complexity 0(n)
    public int[] twoSumMap(int [] nums, int target){
        int [] indices = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if (map.containsKey(target-nums[i])){
                indices[1]=i;
                indices[0]=map.get(target-nums[i]);
            }
            map.put(nums[i], i);
        }
        return indices;
    }



    //Driver/Main method to test the code
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int [] nums = {2,7,11,23};
        int target = 9;
        System.out.println(Arrays.toString(twoSum.twoSumMap(nums, target)));
    }
}
