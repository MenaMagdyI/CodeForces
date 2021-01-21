package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=n/2;
        System.out.println(count);
        if(n%2==0){
            for(int i=0;i<count;i++){
                System.out.print(2+" ");
            }
        }else{
            for(int i=0;i<count-1;i++){
                System.out.print(2+" ");
            }
            System.out.print(3+" ");
        }
    }
}

