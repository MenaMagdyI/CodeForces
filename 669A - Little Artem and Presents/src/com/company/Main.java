package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stonesNum;
        int gifts;
        stonesNum = sc.nextInt();
        gifts = (stonesNum/3)*2;

        if(stonesNum%3 > 0)
            gifts++;

        System.out.println(gifts);

    }
}
