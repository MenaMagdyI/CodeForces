package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String tempChar;

        input = sc.nextLine();
        tempChar = input.charAt(0)+"";
        tempChar.toUpperCase();
        input = tempChar.toUpperCase() + input.substring(1);

        System.out.println(input);



        
    }
}
