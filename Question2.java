package com.company;

import java.util.Scanner;

public class Question2 {
    public void msg2(){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int y = num.nextInt();
        if (y<200 && y%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }


}
