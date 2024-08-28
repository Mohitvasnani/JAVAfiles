package com.DSAbootcamp.sorting;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int [] nums = {2,3,1,5,4,5};
        cycle(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void cycle(int[] nums){
        int i=0;
        while (i< nums.length) {
            int correct = nums[i]-1;

            if (nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else {
                i++;
            }
        }
    }
}
