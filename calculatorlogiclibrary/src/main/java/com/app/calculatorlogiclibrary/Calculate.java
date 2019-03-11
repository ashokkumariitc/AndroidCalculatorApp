package com.app.calculatorlogiclibrary;

/**
 * Created by Ashok Kumar - A20425418 on 3/5/19.
 * Illinois Institute of Technology
 * fashokkumar@hawk.iit.edu
 */
public class Calculate {

    //Method used for calculating the sum of two numbers
    public String add(double num1, double num2){
        return String.valueOf(num1+num2);
    }

    public String subtract(double num1, double num2){
        return String.valueOf(num1-num2);
    }

    public String multiply(double num1, double num2){
        return String.valueOf(num1 * num2);
    }

    public String divide(double num1, double num2){
        return String.valueOf(num1 / num2);
    }

    public String sine(double num){
        return String.valueOf(Math.sin(Math.toRadians(num)));
    }

    public String cos(double num){
        return String.valueOf(Math.cos(Math.toRadians(num)));
    }

    public String tan(double num){
        return String.valueOf(Math.tan(Math.toRadians(num)));
    }
}
