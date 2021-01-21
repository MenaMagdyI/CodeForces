package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int lanes,desks,santaSeat;
        int currentLane = 0,currentDesk=0;
        boolean right = true;
        Scanner sc = new Scanner (System.in);
        lanes = sc.nextInt();
        desks = sc.nextInt();
        santaSeat = sc.nextInt();
        int currentSeatCounter;
        if (santaSeat % 2 == 0) {

            currentSeatCounter = 2;
        }else{
            currentSeatCounter = 1;
        }

        if(santaSeat %2 != 0)
            right = false;


        int i=1,j=1;
        while(i<=desks && j<=lanes){



            if(currentSeatCounter == santaSeat){
                System.out.print(j+" "+i+" ");
                break;
            }

            //System.out.println("i : "+i+", j : "+j+", currentSeat : "+ currentSeatCounter);
            currentSeatCounter +=2;

            if(i==desks && j<=lanes){
                i = 1;
                j++;
            }else{
                i++;
            }
        }


        //System.out.print(currentLane+" "+currentDesk+" ");

        if(right)
            System.out.println("R");
        else
            System.out.println("L");



    }
}
