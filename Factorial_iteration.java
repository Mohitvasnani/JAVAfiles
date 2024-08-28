package com.DSAbootcamp;

import java.util.Scanner;

public class Factorial_iteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(trailingZeroes(x));
    }

    static int fact(int num){
        int product = 1;
        if (num <= 1) {
            return 1;
        }
        for (int i = 1; i <=num ; i++) {
            product = product * i;
        }
        return product;
    }

    static int trailingZeroes(int num){
        int factorial = fact(num);
        int zeroes = 0;
        if (factorial < 1) {
            return 1;
        }
        for (int i = 5; i <=factorial ; i=i*5) {
            zeroes = zeroes + (factorial/i);
        }
        return zeroes;
    }
}
