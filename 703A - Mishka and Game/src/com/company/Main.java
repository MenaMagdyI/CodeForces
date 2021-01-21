package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m,c;
        int mCount=0,cCount=0;

        n = sc.nextInt();
        for (int i=1 ; i<=n;i++){
            sc.reset();
            m = sc.nextInt();
            c = sc.nextInt();

            if (m > c)
                mCount++;
            else if(c > m)
                cCount++;
        }


        if(mCount>cCount){
            System.out.println("Mishka");
        }else if (mCount<cCount){
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
