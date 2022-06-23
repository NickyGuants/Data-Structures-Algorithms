package com.nicky.PracticeQuestions.Arrays.SlidingWindow;

public class MaximumProductSubarray {
    public static int maxProductSubarray(int nums[]){
        int maxProduct = Integer.MIN_VALUE;
        int windowStart =0;
        int windowProduct = 1;
        for (int windowEnd=0; windowEnd< nums.length; windowEnd++){
            windowProduct *= nums[windowEnd];
            if (nums.length==1){
                windowProduct=nums[windowEnd];
            }
            if (nums[windowStart]==0){
                windowProduct=1;
                windowStart++;
            }
            if (windowProduct <0){
                while(windowStart<windowEnd){
                    windowProduct /= nums[windowStart++];
                }
            }
            maxProduct=Math.max(maxProduct, windowProduct);
        }
        return maxProduct;
    }

    public static void main (String [] args){
        int[] nums = {2, 3, -2, 4};
        int[] nums2 ={-2, 0, -1};
        int[] nums3 ={0,2};

        System.out.println(maxProductSubarray(nums));
        System.out.println(maxProductSubarray(nums2));
        System.out.println(maxProductSubarray(nums3));
    }
}
