package com.company;

public class Polynom {
    double[] coef;
    int n;




    public  Polynom(double[] coef){
        this.coef = coef;
    }
    @Override
    public String toString(){
        String result = "";
        if(coef[0]<0){
            result =   "" + coef[0] ;
        }else if(coef[0] == 0){
            result = "";
        } else result =  " + "  + coef[0];


        if ((coef.length >= 2) & (coef[1] == 0)) {
            result = "" + result;
        } else if((coef.length >= 2) & (coef[1] == 1)){
            result =  " x "  + result;
        } else if((coef.length >=2)&( coef[1] == -1)){
            result = "" + "(" + "-" + "x" + ")" + result;
        }else if((coef.length >= 2) & ((coef[1] != -1)|| (coef[1] != 1)) & (coef[1] <= 0)){
            result =   "(" + coef[1] + "x" + ")" +  result;
        } else result = coef[1] + "x"  + result;

        for(int i = 2; i < coef.length; i++) {
            if (coef[i] == 0) {
                result = "" + result;
            }else if ((coef[i] < 0) & ( coef[i] != -1)){
                result = "" + "("  + coef[i] + "x^" + i + ")" + " + " +   result;
            }else if ((coef[i] < 0) & (coef[i] == -1) ){
                result = "" + "(" +" - " +  "x^" + i + ")" + " + " +  result;
            }else if((coef[i] > 0) & (coef[i] == 1)){
                result = "" +  "x^" + i  + " + " + result;
            } else result = "" + coef[i] + "x^" + i  + " + " + result;

        } return result;
    }
    public Polynom addition(Polynom P) {
        int k;
        int m;
        boolean f = false;
        if (n < P.n) {
            k = n;
            m = P.n;
        } else {
            k = P.n;
            m = n;
            f = true;
        }
        double[] mas = new double[m + 1];
        for (int i = 0; i < mas.length; i++) {
            if (i < k + 1) {
                mas[i] = coef[i] + P.coef[i];
            } else {
                if (f) {
                    mas[i] = coef[i];
                } else {
                    mas[i] = P.coef[i];
                }
            }
        }
        Polynom R = new Polynom( mas);
        return R;
    }










}









