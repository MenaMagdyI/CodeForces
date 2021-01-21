package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int steps = 0;
        int range = 5;
        x = sc.nextInt();

       while(range>0 && x > 0){

                steps += x / range;
                x = x % range;
                range--;

        }


        System.out.println(steps);

    }
}
