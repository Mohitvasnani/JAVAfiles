package com.DSAbootcamp.recurssion;

import java.util.Arrays;

public class BubbleSort_recurssion {
    public static void main(String[] args) {
        int[] arr = {4,1,4,3};
        bubble(arr, arr.length-1,0 );
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] nums, int s, int e){
        if (s==0){
            return ;
        }
        if (e<s){
            if (nums[e]>nums[e+1]){
                int temp = nums[e];
                nums[e]= nums[e+1];
                nums[e+1] = temp;
            }
            bubble(nums, s, e+1);
        }
        else {
            bubble(nums, s-1, 0);
        }
    }
}
