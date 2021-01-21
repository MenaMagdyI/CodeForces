package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Long n,k;
        Long index = Long.valueOf(0);
        Long currentElement;
        boolean even = false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        k = sc.nextLong();

        if(n%2 !=0){
            n = n+1;
        }

        if(k>(n/2)){

            index = k - (n/2);
            even = true;
            //System.out.println("Even : "+index);
        } else if(k<= (n/2)){
            if(n%2 !=0){
                k = k+1;
            }
            index = k;
           // System.out.println("Odd : " + index);
        }



        currentElement = index * 2;

        if(even){
            //currentElement = index * ((n/2)-1);
            System.out.println(currentElement);
        }else{
            //currentElement = index * 2;
            System.out.println(currentElement - 1);
        }


    }
}
