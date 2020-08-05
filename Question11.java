package com.company;

public class Question11 {
    public void noLeapYear(){
        int min = 1;
        int max = 4000;
        for(int i = 1; i<=max; i++){
            if(i % 4 == 0)
                continue;
            System.out.println(i);
        }
    }

}
