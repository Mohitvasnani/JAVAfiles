package com.DSAbootcamp.sorting;

public class SumOfDigits_Recurssion {
    public static void main(String[] args) {
        System.out.println(sum(113));
    }
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
