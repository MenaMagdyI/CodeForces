package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        int people, roomCapacity;
        int availableRooms=0;

        n = sc.nextInt();
        for (int i=1 ;i<=n;i++){
            sc.reset();
            people = sc.nextInt();
            roomCapacity = sc.nextInt();

            if((roomCapacity - people) >= 2){
                availableRooms++;
            }

        }
        System.out.println(availableRooms);

    }
}
