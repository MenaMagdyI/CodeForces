package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int calls, artists, dayMins;
        int killsCount = 0;
        Scanner sc = new Scanner(System.in);
        calls = sc.nextInt();
        sc.reset();
        artists = sc.nextInt();
        sc.reset();
        dayMins = sc.nextInt();
        sc.reset();

        for (int i = 1; i<= dayMins; i++){
            if(i%calls == 0){
                if (i%artists == 0){
                    killsCount++;
                }
            }
        }

        System.out.println(killsCount);

    }
}
