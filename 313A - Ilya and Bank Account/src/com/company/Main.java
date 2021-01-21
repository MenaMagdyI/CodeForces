package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;
        String temp;
        input = sc.nextInt();
        String last,beforeLast;
        int lastToint, beforelastToint;

        temp = String.valueOf(input);
        if(input>=0){
            System.out.println(input);
        }else {

            last = temp.substring(0,temp.length()-1);
            beforeLast = temp.substring(0,temp.length()-2) + temp.substring(temp.length()-1,temp.length());

           // System.out.println(last+ " "+ beforeLast);

            lastToint = Integer.parseInt(last);
            beforelastToint = Integer.parseInt(beforeLast);

            if(lastToint >=beforelastToint){
                System.out.println(lastToint);
            }else {
                System.out.println(beforelastToint);
            }





        }
    }
}
