package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int k, r, h = 1, i = 0, j = 1;
        boolean b = true;
        Scanner sc= new Scanner (System.in);

        k = sc.nextInt();
        r = sc.nextInt();

        while (b) {
            i++;
            h = k * i;
            if (h % 10 == 0 || h % 10 == r) {
                b = false;
            }
        }

        System.out.println(i);

    }
}
