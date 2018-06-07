package com.company;

public class lesson3b {
    public static void main(String[] args) {
        // Array - one variable that stores many values
        double [] heights={1.89, 1.90, 1.76, 2.01, 1.45};
        String[] names = {"john", "Mary", "Mike", "Miry", "Mia"};

        // access an element in an array== get its position (start counting from 0)
        System.out.println(names[0]+" " + heights [0]);
        System.out.println(names[3]+" " + heights [3]);

        try {
            double result = 10/0;
            System.out.println(names[6] + " " + heights[6]);
        }
        catch (Exception e)
        {
            System.out.println("error occurred while printing");
        }
    }

}
