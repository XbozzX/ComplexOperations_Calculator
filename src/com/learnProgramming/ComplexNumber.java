package com.learnProgramming;

public class ComplexNumber {
    //init the fields
    private double real;
    private double imaginary;

    //declare the constructor for init the fields
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //declare the getter for real and imaginary
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    // Create a method for adding the real and imaginary number
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    // Create a method for adding the existing real and imaginary number
    public void add(ComplexNumber Number){
        this.real += Number.real;
        this.imaginary += Number.imaginary;
    }

    // Create a method for subtract the real and imaginary number
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Create a method for subtract the existing real and imaginary number
    public void subtract(ComplexNumber Number){
        this.real -= Number.real;
        this.imaginary -= Number.imaginary;
    }
}
