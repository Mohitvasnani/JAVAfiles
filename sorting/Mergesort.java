package com.DSAbootcamp.sorting;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {

        int[] nums = {2,3,4,1,2,8,9,5,4};
        inplaceSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    static void inplaceSort(int[] arr, int start, int end){
        if (end - start == 1) {
            return;
        }
        int mid = (end+start)/2;
        inplaceSort(arr, start, mid);
        inplaceSort(arr, mid, end);

        inplaceFunction(arr, start, mid, end);
    }

    static void inplaceFunction(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;
        while (i<mid && j<end){
            if (arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length ; l++) {
            arr[start+l] = mix[l];
        }

    }








    static  int[] sort(int... arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right= sort(Arrays.copyOfRange(arr,mid, arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int [first.length + second.length];
        int i = 0;
        int j=0;
        int k=0;
        while (i< first.length && j< second.length){
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k]= second[j];
                j++;
            }
            k++;
        }
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
