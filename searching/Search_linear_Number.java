package com.DSAbootcamp.searching;

import java.util.Arrays;

public class Search_linear_Number {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5, 100 , 10};
        int target= 100;
        System.out.println(searchRange(arr,target,2,5));
        System.out.println(Arrays.toString(arr));

    }
    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;

    }
    static int searchRange(int[] arr, int target, int start , int end){
        if (arr.length==0){
            return -1;
        }
        for (start = 0; start < end; start++) {
            if (arr[start]==target){
                return start;
            }
        }
        return -1;

    }

}
