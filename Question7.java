package com.company;

import java.util.Scanner;

public class Question7 {
    public void movies(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a movie name: ");
        String movie = s.next();
        System.out.println("Enter theater: ");
        String theater = s.next();
        switch(movie){
            case "thor" :
                switch(theater){
                    case "elmwood":
                        System.out.println("In " + theater + "currently running movie: " + movie);
                }
        }
    }
}
