package com.shaik;

import java.text.NumberFormat;
import java.util.Scanner;

public class calci {
    public static void main(String args[]){
        //mortgage calculator

        final double months = 12;
        final double percent =100;

        System.out.println("Enter Principal Amount:");
        Scanner scan1  = new Scanner(System.in);
        double principal = scan1.nextDouble();

        System.out.println("Enter Interest Rate:");
        Scanner scan2  = new Scanner(System.in);
        double interest = scan2.nextDouble();
        double monthly_interest = interest / percent / months;

        System.out.println("Enter Duration:");
        Scanner scan3  = new Scanner(System.in);
        double duration = scan3.nextDouble();
        double no_of_payments = duration * months;

        double d1 = interest * Math.pow((1 + monthly_interest),no_of_payments);
        double d2 = Math.pow((1 + monthly_interest),no_of_payments) - 1;

        double mortgage = principal *(d1/d2);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage_formatted = currency.format(mortgage);
        System.out.println("Mortgage is:" + mortgage_formatted);

    }
}
