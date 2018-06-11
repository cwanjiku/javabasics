package com.company;

import java.util.Scanner;

public class Functions {
    public static void area(double h, double b){
        double result = 0.5 * b * h;
        System.out.println(result);
    }
    public static void main(String[] args) {
        System.out.println(1234);
        Scanner s =new Scanner(System.in);
        System.out.println("First number");
        int first = s.nextInt();

        System.out.println(" Second Number");
        int second = s.nextInt();

        int result = first + second;
        System.out.println("sum is " + result);
        area(60, 30);
        area(first, second);



        Functions f= new Functions();
        f.volume(14);
        f.volume(first);
        f.volume(39);
        f.volume(second);


        System.out.println("volume is" + f.volume(10));
        System.out.println("v is" + f.volume(5));
        double v= f.volume( 5);
        System.out.println(Math.round(v));


        f.converter(10000, "USD", true);
        f.converter(24000, "EUR", false);
        f.converter(24000, "UGX" , false);
    }
    public double volume(double r){
        double result = 4/3 * 22/7 * r *r * r;
        //System.out.println(result);
       return result;
    }
    public void converter(double kes, String currency, boolean rounded)
    {
        double result = 0;
        if (currency.equals("USD"))
        {
             result = kes/104;
        }
        else if (currency. equals ("EUR"))
        {
             result = kes/119;

        }
        else if (currency. equals ("GBP"))
        {
            result = kes/135;
        }

        if(rounded == true)
        {
            System.out.println (currency+Math.round(result));
        }

        else {
            System.out.println(currency + result);
        }




    }





}
