package com.company;

import java.util.Scanner;

public class Question1 {
    public void result()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        String msg = a > 100 ? "the number is greater than 100" : "the number is less than 100";
    }
}
