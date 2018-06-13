package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Lesson6 {

    public static void main(String[] args) {

        Person p1=new Person("John", 65, 1.65, true);
        Person p2= new Person("Mary", 56, 1.68, false);
        Person p3 = new Person ("Jane", 45, 1.2, true);
        Person p4 = new Person ("kimani", 67, 1.8, false);
        Person p5=new Person("Jay", 100, 1.95, true);
        Person p6= new Person("Mer", 46, 1.58, false);
        Person p7 = new Person ("Jean", 50.6, 1.25, true);
        Person p8 = new Person ("Maureen", 77, 1.7, false);
        Person p9=new Person("Joan", 66.5, 1.45, true);
        Person p10= new Person("Mark", 60.7, 1.38, false);


        System.out.println(p4.getNames());  // getters get/calls name
        p4.setNames("miriam");  // setters will change a variable

        System.out.println(p4.getNames());

        // p1-p10 are called objects; objects stores data and function


       /* p4.printdetails();
        p5.printdetails();
        p10.printdetails();
        p6.printdetails();*/

        Person[]people = {p1, p2, p3, p4,p5,p6,p7,p8,p9,p10};
        for (Person x:people) {
            x.printdetails();

            // Array is used to store data that will never change e.g months, dates etc.


        }


        //Array list
        ArrayList<Person> persons=new ArrayList<>();
        for (Person p :people ) {
            persons.add(p);
        }
        System.out.println( persons.size());

        persons.remove (0);

        System.out.println(persons.size());

        persons.add(p1);

        Person z=persons.get(5);
        z.printdetails();

        //persons.clear();
        System.out.println(persons.size());


        persons.sort(Comparator.comparing(Person:: getNames).reversed());// sorting the data using a particular field/variable e.g height


        for (Person p: persons) {
            p.printdetails();
        }


        HashMap<String, String > map = new HashMap<>();
        map.put( "names", "john Mark");
        map.put ("colour" , "black");
        map.put("gender", "male");


        System.out.println(map.get("names"));


    }
}
