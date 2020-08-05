package com.company;

import java.util.Scanner;

public class Question5 {
    public void leapYear(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int x = s.nextInt();
        if (x % 4 == 0){
            if(x%100==0) {
                System.out.println("its a leap year");
            }
        }else{
            System.out.println("Not a leap year");
        }
    }
}
