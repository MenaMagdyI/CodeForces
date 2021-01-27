package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a ,b ,c;
        int bDivide, cDivide;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        bDivide = b/2;
        cDivide = c/4;

        int min = Math.min(a,Math.min(bDivide,cDivide));
        System.out.println(min*7);


    }
}
