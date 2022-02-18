package com.nicky.heaps;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        var heap = new Heap();
        int [] nums = {5, 3, 10, 1, 4, 2};
        int index =0;
//        heap.insert(10);
//        heap.insert(2);
//        heap.insert(3);
//        heap.insert(15);
//        System.out.println(heap.remove());
//        System.out.println("Done");

        for (var num: nums) {
            heap.insert(num);
        }
//        while (!heap.isEmpty()){
//            //System.out.println(heap.remove());
//            nums[index++]= heap.remove();
//        }
        //start from the end to get elements in ascending order
        for (int i=0; i< nums.length; i++){
            nums[i]= heap.remove();
        }
        System.out.println(Arrays.toString(nums));
    }
}
