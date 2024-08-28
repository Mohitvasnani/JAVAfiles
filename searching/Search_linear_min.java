package com.DSAbootcamp.searching;

public class Search_linear_min {
    public static void main(String[] args) {
        int[] arr= {20,30,4,5, 100 , 10};
        int target= 100;
        System.out.println(minNo(arr));

    }
    static int minNo(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
               min= arr[i];
            }
        }
        return min;
    }
}
