package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        if(n % 2 == 1){
            System.out.println(-1);
        }else{
            System.out.print("2 1");
            for(int i =3;i<n;i+=2){
                System.out.print(" "+(i+1)+" "+i);
            }
        }
        System.out.println();


    }
}
