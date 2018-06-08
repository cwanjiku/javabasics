package com.company;

public class Lesson4a {
    public static void multiply(double a, int b){
        double results = a*b;
        System.out.println(results);
    }
    public static void main(String[] args) {
        System.out.println("printing");   // print line-to print
        double x=10;
        System.out.println(Math.sqrt(x));
        System.out.println(Math.pow(2,0.5));


        double z=89.4939399393939292992393939;
        System.out.println(Math.round(z));
        System.out.println(z);
        z=Math.round(z);
        System.out.println(z);   //using a function==calling a function

        int result= Math.multiplyExact(5, 10);
        System.out.println(result);

        int r= 7;
        double v= 4/3 *22/7 * Math.pow(r,3);
        System.out.println(v);



        String k= "this is kenya";
        System.out.println(k.length());   // number of xter
        System.out.println(k. toUpperCase());
        String upper =k.toUpperCase();


        System.out.println(upper. isEmpty());

        System.out.println(upper.indexOf("K"));



          add();
          add();
          add();
            multiply(5.2, 60 );
            multiply(3.1, 250);
            multiply(2.5565, 6);



                    area(5);

    }

    public static void add(){
        int results =10+20;
        System.out.println(results);


    }

    public static void area (double r ){
       double results = 22/7 * Math.pow(r,2);
        System.out.println(results);
    }
}
