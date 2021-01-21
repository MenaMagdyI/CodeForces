package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int month, day;
        int daysOfMonth=0;
        int weekLimit = 7;
        int rowCount = 0;
        Scanner sc = new Scanner(System.in);

        month = sc.nextByte();
        day = sc.nextInt();

        if(month == 1 || month ==3 || month ==5 || month ==7 || month ==8 ||month ==10 || month ==12 ){
            daysOfMonth = 31;
        }else if (month == 4 || month == 6 || month == 9 || month ==11){
            daysOfMonth = 30;
        }else if (month == 2){
            daysOfMonth = 28;
        }

        daysOfMonth = daysOfMonth -((weekLimit - day)+1);
        //System.out.println(daysOfMonth);
        rowCount++;
        rowCount = rowCount + (daysOfMonth/weekLimit);
        daysOfMonth = daysOfMonth - ((daysOfMonth/weekLimit)*7);
        //System.out.println(daysOfMonth);
        if (daysOfMonth > 0){
            rowCount++;
        }

        //System.out.println("-----------------------");
        System.out.println(rowCount);


    }
}
