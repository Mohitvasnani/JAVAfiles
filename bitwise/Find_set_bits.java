package com.DSAbootcamp.bitwise;

public class Find_set_bits {
    public static void main(String[] args) {
        System.out.println(calc(7));
    }
    static int calc(int x){

        int count =0;
        while (x>0){
            int last = x&1;
            x = x>>1;
            if (last == 1) {
                count++;
            }
        }


        return count;
    }
}
