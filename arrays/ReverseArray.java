package com.DSAbootcamp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4,5};

        rev(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void rev(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2){
        int temp = index1;
        index1 = index2;
        index2 = temp;
    }

}
