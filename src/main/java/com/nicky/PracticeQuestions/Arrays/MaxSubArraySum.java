package com.nicky.PracticeQuestions.Arrays;

public class MaxSubArraySum {
    public static int findMaxSumSubarray(int[] arr, int k){
        int maxValue = Integer.MIN_VALUE;
        int currentSum =0;
        int j=k;

        for (int i=0; i<arr.length; i++){
            while (j<arr.length){
                currentSum+=arr[i];
                maxValue=Math.max(currentSum, maxValue);
                j++;
            }
        }

        return maxValue;
    }

    public static void main(String[] args){
        int[] nums ={1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(findMaxSumSubarray(nums, 3));
    }
}
