package com.DSAbootcamp;

public class printinga_to_z {
    public static void main(String[] args) {
        for (int i = 0; i < 26 ; i++) {
            char ch = (char) ('A' + i);
            System.out.print(ch + " ");
        }
    }
}