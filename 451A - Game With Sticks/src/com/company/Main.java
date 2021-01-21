package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int min = Math.min(n,m);

        if(min%2 == 0){
            System.out.println("Malvika");
        }else{
            System.out.println("Akshat");
        }


    }
}
