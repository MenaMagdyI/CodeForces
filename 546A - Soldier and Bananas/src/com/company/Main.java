package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int costOfBanana, money, numOfBanana;
        int borrow = 0;
        int totalmoneyRequired = 0;

        costOfBanana = sc.nextInt();
        sc.reset();
        money = sc.nextInt();
        sc.reset();
        numOfBanana = sc.nextInt();



        for(int i =1 ; i<=numOfBanana;i++){
            totalmoneyRequired += i * costOfBanana;
        }

        if(totalmoneyRequired > money){
            borrow = totalmoneyRequired - money;
        }


        System.out.println(borrow);




    }
}
