package com.shaik;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scann = new Scanner(System.in);
        int numberEnter = scann.nextInt();
        boolean status = false;

        //using if statement
        if(numberEnter % 5 ==0 && numberEnter % 3 ==0){
            System.out.println("FizzBuzz");
        }else if(numberEnter % 5 ==0){
            System.out.println("Fizz");
        } else if (numberEnter % 3 ==0){
            System.out.println("Buzz");
        } else {
            System.out.println(numberEnter);
        }


    }
}
