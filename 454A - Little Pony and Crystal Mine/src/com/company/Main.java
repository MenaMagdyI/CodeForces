package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int l=n/2+1,r=n/2-1;
        System.out.println(l+" "+r);
        for(int i=0;i<n;i++){
            if(i<=n/2){
                l--;
                r++;
            }
            else{
                l++;
                r--;
            }

            for(int j=0;j<l;j++)
                System.out.print("*");
            for(int j=l;j<=r;j++)
                System.out.print("D");
            for(int j=r+1;j<n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
