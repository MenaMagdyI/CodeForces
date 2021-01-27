package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String prefix ="";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1 ; i<=n;i++){
            prefix = prefix + i+"";
        }


        System.out.println(prefix.charAt(n-1));
    }
}
