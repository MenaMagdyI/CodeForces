package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        System.out.print("I hate ");

        for (int i = 2;i<=n;i++){
            if(i%2 == 0){
                System.out.print("that I love ");
            }else{
                System.out.print("that I hate ");
            }
        }


        System.out.print("it");
    }
}
