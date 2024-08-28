package com.DSAbootcamp.searching;

public class Search_Binary {
    public static void main(String[] args) {
        int[] nums = {1,30,31,33,45,66,71};
        int ans = search(nums, 66);
        System.out.println(ans);
    }

    static int search(int[] arr , int target ){
        int start=0;
        int end = arr.length -1;
        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid]>target){
                end = mid-1;    //search in the left of array mid
            } else if (arr[mid]<target) {
                start = mid+1;  //search in the right of the array mid
            }
            else {
                return arr[mid];
            }
        }
        return -1;
    }
}
