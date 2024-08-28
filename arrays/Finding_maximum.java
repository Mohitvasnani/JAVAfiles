package com.DSAbootcamp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Finding_maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[10];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(max(nums));
    }


    static int max(int[] arr){

        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}
