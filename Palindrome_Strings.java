package com.DSAbootcamp;

import java.util.Scanner;

public class Palindrome_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.next();
        System.out.println(palin(str));



    }

    static boolean palin(String str){
        if (str== null){
            return true;
        }
        str =str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start!=end){
                return false;
            }
        }
        return true;
    }
}
