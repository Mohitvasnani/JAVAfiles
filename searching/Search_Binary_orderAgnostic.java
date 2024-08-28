package com.DSAbootcamp.searching;

public class Search_Binary_orderAgnostic {
    public static void main(String[] args) {
        int[] nums = {1000,350,345,330,95,86,71};
        int ans = search(nums, 1000);
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
        return -1;
    }
}
