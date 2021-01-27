package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Long x;
        char c;
        Long d;
        int kidsCounter = 0;


        n = sc.nextInt();
        x = sc.nextLong();

        for(int i =1;i<=n;i++){
            sc.reset();
            c = sc.next().charAt(0);
            d = sc.nextLong();

            if(c == '+'){
                x +=d;

            }else{

                if(x>=d){
                    x -= d;
                }else {
                    kidsCounter++;
                }

            }
        }

        System.out.println(x+" "+kidsCounter);

    }
}
