package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        int aWins =0, bWins = 0, draw =0;

        for (int i=1; i<=6;i++){
            if(Math.abs(i - a) < Math.abs(i-b)){
                aWins++;
            }else if( Math.abs(i-b) < Math.abs(i - a)){
                bWins++;
            }else{
                draw++;
            }

        }

        System.out.println(aWins+" "+draw+" "+bWins);

    }
}
