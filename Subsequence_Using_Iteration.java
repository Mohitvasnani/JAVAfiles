package com.DSAbootcamp;

import java.util.ArrayList;
import java.util.List;

public class Subsequence_Using_Iteration {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = iterate(nums);
        for (List<Integer> list: ans) {
            System.out.println(list);
        }
    }
    static List<List<Integer>> iterate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
