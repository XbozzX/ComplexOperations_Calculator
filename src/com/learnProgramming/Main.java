package com.learnProgramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //User will insert the input inside the class
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber Number = new ComplexNumber(2.5,-1.5);

        //User call add method with the adding real number and imaginary number
        //as a parameter
        one.add(1,1);

        //Display the result into console
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        //User call subtract method with adding Number as an object
        // to be the parameter
        one.subtract(Number);

        //Display the result into console
        System.out.println("=========================================");
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        System.out.println("=========================================");

        //User call subtract method with adding One as an object
        // to be the parameter
        Number.subtract(one);
        System.out.println("Number.real= " + Number.getReal());
        System.out.println("Number.imaginary= " + Number.getImaginary());

    }
}
