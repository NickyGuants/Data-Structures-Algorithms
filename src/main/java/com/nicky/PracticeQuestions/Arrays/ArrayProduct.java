package com.nicky.PracticeQuestions.Arrays;

import java.util.Arrays;

public class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        int [] product = new int[nums.length];
        for (int i=0; i< nums.length; i++){
            product[i]=nums[0];
            product[i]=product[i]*nums[i];
        }
        return product;
    }


    public static void main(String[] args) {
        ArrayProduct arrayProduct = new ArrayProduct();
        int [] nums={1,2,3,4};
        System.out.println(Arrays.toString(arrayProduct.productExceptSelf(nums)));
    }
}
