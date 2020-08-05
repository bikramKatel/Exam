package com.company;

import java.util.Scanner;

public class Question9 {
    public void printpattern(){
        Scanner s = new Scanner(System.in);
        System.out.println("how many rows you want to print: ");
        int x = s.nextInt();
        for (int i = 1; i <=x; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
        }
    }

}
