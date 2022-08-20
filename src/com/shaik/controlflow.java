package com.shaik;

public class controlflow {
    public static void main(String args[]){
        //comparison operators
        int x = 5;
        int y= 10;
        System.out.println(x<=y); // boolean expression ==, !=, >, <, >=, <=

        // logical operators
        int temp = 32;
        boolean isWarm = temp > 20 && temp <10; // && , ||
        System.out.println(isWarm);

        //if statements
        if (temp > 30) {
            System.out.println("its a hot day");
            System.out.println("drink water");
        } else if (temp > 20 && temp<=30){
            System.out.println("weather is good");
        } else{
            System.out.println("cold day");
        }

        // simplifying if statements
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        //  ternary operator
        String className = income > 100_000 ? "First class" : "Economy";
        System.out.println(className);

        //switch statements
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("administrator");
                break;
            case "student" :
                System.out.println("student");
                break;
            default:
                System.out.println("no role");

        }

        // for loop
        for (int i=0; i<5;i++){
            System.out.println("for loop"+i);
        }

        //while loop
        int j = 0;
        while(j<5){
            System.out.println("while loop"+j);
            j++;
        }

        //do-while loop
        int k = 0;
        do{
            System.out.println("do-while loop"+k);
            k++;
        }while(k<5);

        //break and continue
        // breaks  statement breaks the loop and continue statement moves to beginning of the loop

        //for each loop--iterate over arrays and collections
        String[] fruits = {"apple", "banana", "mango"};
         for(int i=0; i< fruits.length ; i++){
             System.out.println(fruits[i]);
         }

         for(String fruit :fruits){
             System.out.println(fruit);
         }

    }
}
