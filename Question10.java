package com.company;

import java.util.Scanner;

public class Question10 {
    public void calcSum(){
        Scanner s = new Scanner(System.in);
        System.out.println("How many times you want to print: ");
        int x = s.nextInt();
        int j = 1;
        int m = 0;
        while (x>=j){
            System.out.println("Enter a number: ");
            int y = s.nextInt();
            x-=1;
            if(x<0){
                break;
            }
            if (y % 2 == 0){
                 m = m + y;

            }
        }
        System.out.println("the sum of even numbers is: " + m);

    }
}
