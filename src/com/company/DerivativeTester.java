package com.company;

import java.math.BigDecimal;

public class DerivativeTester {
    //TODO: Refactor with BigDecimal instead of double

    public static BigDecimal dx = new BigDecimal("1.0e-20");
   public static BigDecimal test = new BigDecimal("20");
    public static void main(String[] args) {
	    for(int i=0; i<5; i++){
	        System.out.println("f^"+i+"(2) = " + df(i, new BigDecimal("2")));
        }
        //test = test.add(new BigDecimal("30"));
	    //System.out.println(test);

    }

    //Enter custom function f(x) here
    public static BigDecimal f(BigDecimal x) {
        return x.multiply(x);   //Example f(x) = x^2
    }

    //Returns the n'th derivative of f(x) at x=c
    public static BigDecimal df(int n, BigDecimal c){
        if(n == 0)
            return f(c);
        else if(n>0){
            return (df(n-1, c.add(dx)).subtract(df(n-1,c))).divide(dx);
        }
        else
            return new BigDecimal("0");
    }
}
