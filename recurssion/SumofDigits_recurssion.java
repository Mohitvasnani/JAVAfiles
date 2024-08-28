package com.DSAbootcamp.recurssion;

public class SumofDigits_recurssion {
    public static void main(String[] args) {

        System.out.println(sumOfDigits(36  ));

    }
    static int sumOfDigits(int x){

        if (x == 0) {
            return 0;
        }


        return x%10 + sumOfDigits(x/10);
    }
}
