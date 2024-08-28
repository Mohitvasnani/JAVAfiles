package com.DSAbootcamp.recurssion;

public class Factorial_recurssion {
    public static void main(String[] args) {
        System.out.println(fact(1 ));
    }
    static int fact(int n){
        if (n == 1) {
            return  1;
        }
        int factorial = n * fact(n-1);
        return factorial;
    }
}
