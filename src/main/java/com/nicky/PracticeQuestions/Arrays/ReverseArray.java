package com.nicky.PracticeQuestions.Arrays;

import java.util.Arrays;

public class ReverseArray {
    //using a single pointer
    public static void reverse(int [] nums){
        int temp;
        for(int i=0; i<nums.length/2; i++){
            temp =nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
    }

    //using two pointers
    public static void reverseTwoPointer(int [] nums){
        int i=0;
        int j= nums.length-1;
        while (i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void main(String [] args){
        int [] nums= {1,2,3,4,5,6};
        ReverseArray.reverse(nums);
        System.out.println(Arrays.toString(nums));
        ReverseArray.reverseTwoPointer(nums);
        System.out.println(Arrays.toString(nums));
    }
}
