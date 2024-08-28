package com.DSAbootcamp;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no." );
        int x = sc.nextInt();
        System.out.println(Is_prime(x));
    }

    static int reverse_of_no(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            sum = (sum * 10) + rem;

        }
        return sum;
    }
    static boolean Is_prime(int n){
        if (n <1) {
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}
