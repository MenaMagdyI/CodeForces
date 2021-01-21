package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,k;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        k = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                if(i == j){
                    System.out.print(k+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
