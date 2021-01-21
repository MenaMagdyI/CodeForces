package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int friendCount, bottleCount,milliOfDrinks,limes, limesSlices,saltGrams,milliForEach,saltForEach;
        Scanner sc = new Scanner(System.in);

        int drinkToast, sliceToast,saltToast;

        friendCount = sc.nextInt();
        bottleCount = sc.nextInt();
        milliOfDrinks = sc.nextInt();
        limes = sc.nextInt();
        limesSlices = sc.nextInt();
        saltGrams = sc.nextInt();
        milliForEach = sc.nextInt();
        saltForEach = sc.nextInt();

        drinkToast = (bottleCount * milliOfDrinks) / milliForEach;
        sliceToast = limes * limesSlices;
        saltToast = saltGrams / saltForEach;

        System.out.println((Math.min(drinkToast,Math.min(sliceToast,saltToast))) / friendCount);



    }
}
