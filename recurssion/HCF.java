package com.DSAbootcamp.recurssion;

public class HCF {
    public static void main(String[] args) {
        System.out.println(gcd(300,18));
    }

    static int gcd(int a, int b){
        if (a == 0) {
            return b;
        }
        return gcd(b%a,a);
    }
}
