package com.company;

public class Person {
    // properties of a person
    String names;
    double weight;
    double height;
    boolean righthanded;   //stores a value of either true of false

    // special function to help store the datA== CONSTRUCTOR


    public Person(String names, double weight, double height, boolean righthanded) {
        this.names = names;
        this.weight = weight;
        this.height = height;
        this.righthanded = righthanded;
    }
    // Getters and setters === are functions


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isRighthanded() {
        return righthanded;
    }

    public void setRighthanded(boolean righthanded) {
        this.righthanded = righthanded;
    }


    public void printdetails(){
        String hand = isRighthanded()? "right handed"  : "left handed";
        System.out.println(names + " " + weight + " " + height + " " + hand);
    }
}
