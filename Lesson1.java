package com.company;

public class Lesson1 {
    public static void main(String[] args) {
        // variables===stores data
        int years = 18;  // variable name should be lower case
        double height = 1.8; //double for decimals
        //int size = 0.005 not possible as int has a small storage allocation and decimals require a large space
        double weight =70; // its possible
         double results = years* height;
        System.out.println(results);

        System.out.println(height*years);

        years =30; //reassigning the variable years

        String name="Catherine";   // String - words/text
        String sentence = "The quick brown fox jumped over the fence";
        System.out.println(name +" " +sentence + " "+results);
        String many = name +" " +sentence + " "+results;
        System.out.println(many);


        boolean completed=true;


    }
}
