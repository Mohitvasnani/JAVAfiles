package com.DSAbootcamp;

public class Patternquestions {
    public static void main(String[] args) {
        pat5(5);

    }

    static void pat(int n){
        for (int r= 1; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pat1(int n){
        for (int r= 1; r<=n; r++){
            for (int c=1; c<=n; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat2(int n){
        for (int r= 0; r<=n; r++){
            for (int c=1; c<=n-r; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat3(int n){
        for (int r= 0; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void pat4(int n){
        for (int r= 0; r<=2*n; r++){
            int totalcol = r > n ? 2*n -r : r;
            for (int c=1; c<=totalcol; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat5  (int n){
        for (int r= 0; r<=2*n; r++){
            int totalcol = r > n ? 2*n -r : r;

            int space= n-totalcol;
            for (int s =0; s<space; s++){
                System.out.print(" ");
            }


            for (int c=1; c<=totalcol; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat6  (int n){
        for (int r= 0; r<=2*n; r++){
            int totalcol = r > n ? 2*n -r : r;


            for (int s =0; s<n-r; s++){
                System.out.print(" ");
            }


            for (int c=1; c<=totalcol; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
