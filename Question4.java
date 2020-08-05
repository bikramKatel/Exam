package com.company;

import java.util.Scanner;

public class Question4 {
    public void tipCalc(){
        Scanner bill = new Scanner(System.in);
        System.out.println("Enter a bill amount: ");
        double x = bill.nextInt();
        System.out.println("enter tip percent: ");
        double y = bill.nextInt();
        double tip = x * y/100;
        System.out.println("the tip amount is: " + tip);

    }
}
