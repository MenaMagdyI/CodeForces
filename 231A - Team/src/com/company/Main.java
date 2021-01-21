package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int p,v,t;
        int temp, problems=0;

        n = sc.nextInt();

        for(int i=1; i<=n;i++){
            sc.reset();
            p = sc.nextInt();
            v = sc.nextInt();
            t = sc.nextInt();

            temp = p+v+t;
            if(temp >= 2){
                problems++;
            }

        }

        System.out.println(problems);

    }
}
