package com.nicky.PracticeQuestions.Arrays;

public class MaxSubArraySum {
    //brute force solution
    //Time complexity 0(n*k)
    public static int findMaxSumSubarray(int[] arr, int k){
        int maxValue = Integer.MIN_VALUE;
        int n=arr.length;

        for (int i=0; i<n-k+1; i++){
            int currentSum =0;
           for (int j=0; j<k; j++){
               currentSum+=arr[i+j];
           }
           maxValue=Math.max(currentSum, maxValue);
        }
        return maxValue;
    }

    //Optimized soln using sliding window technique
    //Time complexity O(n)
    public static int maxSum(int[] arr, int k){
        //ensure length of array is bigger than k
        if (arr.length<k) return -1;

        //calculate the sum of the first k elements
        int max_sum = 0;
        for (int i=0; i<k; i++){
            max_sum += arr[i];
        }

        //Now calculate the remaining windows by removing first element
        //of the previous window and adding the last element of the current window
        int window_sum=max_sum;
        for (int i=k; i<arr.length; i++){
            window_sum= window_sum-arr[i-k]+arr[i];
            max_sum=Math.max(window_sum, max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args){
        int[] nums ={1, 2,3,4};

        System.out.println(findMaxSumSubarray(nums, 2));
    }
}
