package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int blueSocks, redSocks;
	    int daysOfDiffSocks, daysOfSameSocks;
	    int max=0, min=0;
        Scanner sc = new Scanner(System.in);

        blueSocks = sc.nextInt();
        redSocks = sc.nextInt();

        if(blueSocks > redSocks){
            max = blueSocks;
            min = redSocks;
        }else{
            max = redSocks;
            min = blueSocks;
        }

        daysOfDiffSocks = min;
        max = max - min;
        daysOfSameSocks = max / 2;


        System.out.println(daysOfDiffSocks+" "+daysOfSameSocks);
    }
}
