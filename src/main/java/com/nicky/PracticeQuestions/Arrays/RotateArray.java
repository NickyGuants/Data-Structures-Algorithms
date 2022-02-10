package com.nicky.PracticeQuestions.Arrays;

import java.util.Arrays;

public class RotateArray {
    //use extra space ie another array to store the rotated array.
    public static void rotateArray(int[] nums, int k){
        int[] rotatedArray = new int[nums.length];
        int n = nums.length;
        int j=0;

        for (int i=n-k; i< n; i++){
            rotatedArray[j++]=nums[i];
        }
        for (int i=0; i< n-k; i++){
            rotatedArray[j++]=nums[i];
        }
        for (int i=0; i< nums.length; i++){
            nums[i]=rotatedArray[i];
        }
    }

    public static void rotateArrayTwoPointer(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end){
        int temp;
        while (start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String [] args){
        int[] nums = {1,2,3,4,5,6,7};
//        rotateArray(nums, 3);
//        System.out.println(Arrays.toString(nums));
        rotateArrayTwoPointer(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
