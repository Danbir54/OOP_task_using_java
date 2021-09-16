package danbir;

/*
Name    : Danbir Rashid
Id      : 2012020189
Section : 5D
Email   : cse_2012020189@lus.ac.bd
Date    : 07/08/2021
 */

public class Main {

    public static void main(String[] args) {
	Student S1 = new Student();
	Student S2 = new Student("Tufayel");
	Student S3 = new Student("Danbir" , 2012020189);
	S1.display(); //you can also call "display()" method by using others object,result will be same!
    }
}
