package com.DSAbootcamp.bitwise;

public class Magicno {
    public static void main(String[] args) {

        System.out.println(calc(8));

    }

    static int calc(int x){
        int ans = 0;
        int base = 5;
        while (x>0){
            int last = x&1;
            x = x>>1;
            ans = ans + (last*base);

            base = base *5;
        }

        return ans;
    }
}
