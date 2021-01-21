package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        String prevMagnet,currentMagnet;
        int max=0,counter=0;
        int groups = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();



        prevMagnet = sc.next();
        counter++;
        max = counter;
        groups++;


        for (int i =2 ; i<= n; i++){
            sc.reset();
            currentMagnet = sc.next();

            if(prevMagnet.equals(currentMagnet)){
                counter++;
                //System.out.println("EQuals, counter : "+counter);
                if(max<counter){
                    max = counter;
                }
                //System.out.println("EQuals, counter : "+counter);

            }else{
                if(max<counter){
                    max = counter;
                }
                counter = 1;
                prevMagnet = currentMagnet;
                groups++;
                //System.out.println("NOT EQuals, counter : "+counter);

            }

        }

        System.out.println(groups);


    }
}




