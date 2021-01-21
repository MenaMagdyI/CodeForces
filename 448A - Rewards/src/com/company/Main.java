package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int cups=0, prizes=0,shelf;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<3;i++){ // cups inputs
            cups += sc.nextInt();
            sc.reset();
        }

        for (int i = 0; i<3;i++){ // medals input
             prizes += sc.nextInt();
             sc.reset();
        }

        shelf = sc.nextInt(); // nums of shelfs

        for (int i = 1; i<= shelf;i++){
            if(cups>0){
                cups -= 5;
            }else {
                if (prizes>0){
                    prizes -= 10;
                }
            }
        }

        if (cups <= 0 && prizes <=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



    }
}
