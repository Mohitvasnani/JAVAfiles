package com.DSAbootcamp.recurssion;

public class Printingn_recurssion {
    public static void main(String[] args) {
        fun(7);
    }
    static void fun(int n){
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
        System.out.print(n + " ");

    }
}
