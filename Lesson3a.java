package com.company;

public class Lesson3a {
    public static void main(String[] args) {
        //BMI calc
        double weight = 200;
        double height = 1.88;
        double bmi = weight / (height * height);
        System.out.println("Your Body Mass Index is " + bmi);
        if (bmi < 15) {
            System.out.println("very severely underweight");
        } else if (bmi >= 15 && bmi < 16) {
            System.out.println("severely underweight");
        } else if (bmi >= 16 && bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal (healthy weight)");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Obese class I (moderately obese)");
        } else if (bmi >= 35 && bmi < 40) {
            System.out.println("Obese class II (severely obese)");
        } else if (bmi >= 40 && bmi < 45) {
            System.out.println("Obese class III (very severely obese)");
        } else if (bmi >= 45 && bmi < 50) {
            System.out.println("Obese class IV (morbidly obese)");
        } else if (bmi >= 60) {
            System.out.println("Obese class VI (hyper obese)");
        } else if (bmi >= 50 && bmi < 60) {
            System.out.println("Obese class V (super obese)");
        }
    }
}
