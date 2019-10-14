package com.company;

public class Main {

    public static void main(String[] args) {
        double[] n = new double[8];
        n[0] = 0;
        n[1] = -11;
        n[2] = 1;
        n[3] = -100;
        n[4] = -1;
        n[5] = 1;
        n[6] = 0;
        n[7] = -1;
        Polynom a = new Polynom(n);
        System.out.println(a);

        double[] P = new double[5];
        P[0] = 0;
        P[1] = 2;
        P[2] = 4;
        P[3] = -5;
        P[4] = 1;
        Polynom b = new Polynom(P);
        System.out.println(b);




    }
}
