package com.company;

import java.util.Scanner;

public class Question12 {
    public void chooseCorrect(){
        String choice = "c";
        char x = ' ';
        Scanner s = new Scanner(System.in);
        System.out.println("enter your choice: ");
        String ans = s.next();
        while (choice != "c"){
            if(choice != "c"){
                System.out.println("Incorrect");
                System.out.println("Again? press y to continue");
                if(x == 'y'|| x=='Y'){
                    System.out.println("enter your choice: ");
                    ans = s.next();
                }else if(x == 'n' || x=='N')
                    break;

            }

        }

    }
}
