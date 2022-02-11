package com.nicky.PracticeQuestions.Arrays;

import java.util.Arrays;

public class reverseArrayQueries {
    public static int[] performOperations(int[] arr, int[][] operations) {
        for(int i=0; i<operations.length; i++){
            reverse(arr,operations[i][0] , operations[i][1]);
        }
        return arr;
    }

    private static void reverse(int[] nums, int start, int end){
        int temp;
        while(start < end){
            temp= nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String [] args){
        int[] arr= {1,2,3};
        int[][] operations= {{0,2}, {1,2}, {0,2}};

        System.out.println(Arrays.toString(performOperations(arr, operations)));
    }
}
