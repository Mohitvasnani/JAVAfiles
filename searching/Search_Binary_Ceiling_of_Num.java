package com.DSAbootcamp.searching;

public class Search_Binary_Ceiling_of_Num {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,9,11,16,17,19};
        int ans = search(nums, 12);
        System.out.println(ans);

    }
    static int search(int[] arr , int target ){
        int start=0;
        int end = arr.length -1;
        boolean ascending = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (ascending){
                if (arr[mid]>target){
                    end = mid-1;    //search in the left of array mid
                } else  {
                    start = mid+1;  //search in the right of the array mid
                }
            }
            else {
                if (target>arr[mid]){
                    end = mid-1;    //search in the left of array mid
                } else  {
                    start = mid+1;  //search in the right of the array mid
                }
            }

        }
        return arr[end];
    }
}
