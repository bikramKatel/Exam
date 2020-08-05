package com.company;

public class Question8 {
    public void printTraingle(){
        int x = 8;
        char c = ' ';
        for (int i = 1; i<=8; i++){
            for (int j = 1; j <=i; j++){
                System.out.print(c*i + '*');
            }
        }
    }
}
