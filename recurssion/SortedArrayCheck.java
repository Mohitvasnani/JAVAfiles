package com.DSAbootcamp.recurssion;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,7,88,99,100};
        System.out.println(check(nums,0));
        int[] rums = {1,2,3,4,7,88,9,100};
        System.out.println(check(rums,0));
    }
    static boolean check(int[] arr,int index ){
        if (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && check(arr, index+1);

    }

}
