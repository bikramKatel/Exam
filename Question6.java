package com.company;

import java.util.Scanner;

public class Question6 {
    public void chkAlpha(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String c = s.next();
        switch(c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("vowel");
                break;
            default:
                System.out.println("Consonant");
                break;

        }
    }
}
