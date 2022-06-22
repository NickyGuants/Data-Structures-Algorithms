package com.nicky.PracticeQuestions.Arrays.twoPointers;

//calculate the container with most water
public class ContainerWithMostWater {
    public static int maxArea(int[] height){
        int max_area =Integer.MIN_VALUE;
//        Brute force O(n^2)
//        for (int i=0; i< height.length; i++){
//            for(int j=i+1; j< height.length; j++){
//                int min_height = Math.min(height[i],height[j]);
//                max_area= Math.max(max_area, min_height * (j-i));
//            }
//        }

        //optimized solution using two pointers starting from end and start.
        int start=0;
        int end = height.length-1;
        while (start < end){
            int min_height = Math.min(height[start], height[end]);
            max_area = Math.max(max_area, min_height*(end-start));
            if (height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }

        return max_area;
    }

    public static void main(String [] args){
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
