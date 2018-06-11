package com.company;


import com.company.hidden.Hidden;

public class Lesson5a
{
    public static void main(String[] args) {

        Functions.area(5, 10);

        Functions x = new Functions();
        x.converter(19999, "USD", true);
        System.out.println(x.volume(5.4));

        Hidden h= new Hidden ();
        h.add(2,16);




    }
}
