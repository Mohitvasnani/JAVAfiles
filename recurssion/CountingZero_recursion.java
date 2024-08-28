package com.DSAbootcamp.recurssion;

public class CountingZero_recursion {
    public static void main(String[] args) {
        System.out.println(zero(100020));

    }

    private static int helper(int n, int count){
        if (n == 0) {
            return count;
        }
        int rem = n%10;
        if (rem == 0) {
            helper(n/10,count+1);
        }
        return helper(n/10, count);
    }
    static int zero(int n){
        int ans = helper(n,0);
        return ans;

    }
}
