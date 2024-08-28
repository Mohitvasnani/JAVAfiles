package com.DSAbootcamp;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("enter year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leap(year);

    }

    static void leap(int y){
        if (y%4==0){

                if (y%400==0){
                    System.out.println("leep");
                }
                else {
                    System.out.println(y + " not leep");
                }

        }
        else {
            System.out.println("not leap");
        }

    }
}
