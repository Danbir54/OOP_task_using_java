package danbir;

/*
Name    : Danbir Rashid
Id      : 2012020189
Section : 5D
Email   : cse_2012020189@lus.ac.bd
Date    : 07/08/2021
 */

public class Student {
    String name;
    int id;
    static String universityName = "Leading University";

    //Constructor Overloading
    Student() //default constructor
    {
        System.out.println();
        System.out.println("Student class created!(default constructor)");
        System.out.println("Nothing Found!");
    }
    Student(String name) //constructor with one parameter
    {
        System.out.println();
        System.out.println("Parameterized constructor along with one parameter(String)!");
        System.out.println("Name : " +name);
        this.name = name;
    }
    Student(String name , int id) //constructor with two parameter
    {
        System.out.println();
        System.out.println("Parameterized constructor along with two parameter(String & Integer)!");
        System.out.println("Name : " +name);
        System.out.println("Id   : " +id);
        this.name = name;
        this.id = id;
    }
    void display()
    {
        System.out.println();
        System.out.println("Method called!");
        System.out.println("University Name : " +universityName);
    }

}
