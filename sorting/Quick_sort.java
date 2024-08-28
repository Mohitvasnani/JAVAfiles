package com.DSAbootcamp.sorting;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        quick(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    static void quick(int[] arr, int low, int hi ){
        while (low>=hi){
            return;
        }
        int start = low;
        int end = hi;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while (start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if (start<= end) {
                //swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick(arr, low, end);
        quick(arr, start, hi);
    }

}
