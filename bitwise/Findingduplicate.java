package com.DSAbootcamp.bitwise;

public class Findingduplicate {
    public static void main(String[] args) {
        int[] nums = {5,6,5};
        int ans= dup(nums);
        System.out.println(ans);

    }

    static int dup(int[] arr){
        int single = 0;
        for (int n: arr) {
            single = single ^ n;
        }
        return single;
    }
}
