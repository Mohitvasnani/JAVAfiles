package com.DSAbootcamp;

import java.util.Scanner;

public class PalindromeOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
        System.out.println(palindrome(num));
    }
    static int reverse(int x){
        int rev = 0;
        while (x>0){
            int digit = x%10;
            rev = rev *10 + digit;
            x=x/10;
        }
        return rev;
    }
    static boolean palindrome(int x){
        if (x == 0) {
            return false;
        } else if (x==reverse(x)) {
            return true;
        }else {
            return false;
        }
    }
}
