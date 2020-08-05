package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Question13 {
    public void cleanWhiteSpace() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string to be cleaned: ");
        String x = s.next();
        char[] m = x.toCharArray();
        for (int i = 0; i <= m.length; i++) {
            if (m[i] == ' ') {
                continue;
            }
            System.out.println(m[i]);

        }
    }
}
