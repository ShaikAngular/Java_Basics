package com.shaik;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // mainly 2 datatypes -- primitive types (for storing simple values), Reference types(storing complex objects)
        // primitive types -- byte (1B), short (2B), int (4B) , long (8B), float (4B), double (8B), char (2B), boolean (1B)

        int myAge = 20;
        int herAge = myAge;
        int viewCount = 123_456_789;
        float price = 10.99F;
        char letter = 'A';
        boolean value = false;
        // reference types -- Date(), Point()
        //reference types copied by references whereas primitive types copied by values
        Date today = new Date();
        today.getTime();
        System.out.println("Hello world!"+ herAge + "view count" + viewCount + "price"+price);
        System.out.println("today" + today + "time" + today.getTime());
        // strings are immutable in java (cannot change, original string cannot be modified)
        String message = new String("Welcome");
        String msg = "How r u";
        System.out.println(message + "---" + msg.toLowerCase());

        //Escape sequence
        // use back slash
        String quotes = "He is \"special\"";
        String sequence= "c:\\windows..";
        System.out.println(sequence + quotes);

        //Arrays -- to store list of items
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers + "Actual array" + Arrays.toString(numbers));
        int[] newNumbers = {16,7,4,9, 14};
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers) );
        System.out.println(newNumbers.length);

        //multi-dimensional arrays
        int[][] multiArray= {{1,0,1}, {0,1,0}};
        System.out.println(Arrays.deepToString(multiArray));

        //constants -- cannot change value later using final keyword
        final float pi= 3.14F;

        //Arithmetic expressions
        // addition, subtraction, multiplication, division, modulas etc..
        int result = 10 +3;
        int result1 = 10-3;
        int result3 = 10 *3;
        double result4 = (double)10/ (double)4;
        System.out.println( result4);

        //order of operations  () => / * => + -
        int x = 10 + 3 * 2;
        System.out.println(x);

        //casting and type conversion
        //implicit casting  byte > short > int > long > flot > double
        // implicit casting happens when there is loss of data
        short x1 = 1;
        int y = x1+2;
        System.out.println(y);
        //explicit casting
        double p =1.1;
        int q = (int)p+2;
        System.out.println(q);

        String a = "5";
        int b = Integer.parseInt(a) +2; //wrapper classes
        System.out.println(b);

        // Math class
        int c = Math.round(1.23F);
        double d  = Math.ceil(2.178);
        System.out.println(c);
        System.out.println(d);
        int res = Math.max(5,7);
        System.out.println(res);
        // max, min , random, etc..
        double res1 = Math.random();
        System.out.println(res1);

        double res2  = Math.round(Math.random() * 100);
        System.out.println(res2);

        //formatting numbers
        // $123,456   10%
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String r = currency.format(123456.789);
        System.out.println(r);

        //reading input
        Scanner scan = new Scanner(System.in);
         byte age =  scan.nextByte();
        System.out.println("age is"+age);

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
        String mortgage_formatted = currency.format(mortgage);
        System.out.println("Mortgage is:" + mortgage_formatted);

    }
}