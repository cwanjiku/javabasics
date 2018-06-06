package com.company;

public class Lesson2 {
    public static void main(String[] args) {
        String original_username= "abc@yahoo.com";
        String original_password = "123456";

        String username= "abc@yahoo.com";
        String password="123456";

        if (original_username==username && original_password==password)
        {
            System.out.println("logged in successfully");
        }
        else {
            System.out.println("wrong username or password");
        }
    }
}
