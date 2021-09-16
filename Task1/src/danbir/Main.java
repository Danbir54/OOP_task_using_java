package danbir;

/*
Name   : Danbir Rashid
Id     : 2012020189
Section: 5D
Email  : cse_2012020189@lus.ac.bd
Date   : 15/07/2021
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Info info = new Info();
        Hobby hobby = new Hobby();

        String section;
        System.out.print("Enter Your Section Please: ");
        section = input.nextLine();

        System.out.println();
        System.out.println("Name      : " +info.name);
        System.out.println("Id        : " +info.id);
        System.out.println("Section   : " +section);
        System.out.println("Hobby Name: " +hobby.hobbyName);

    }
}
