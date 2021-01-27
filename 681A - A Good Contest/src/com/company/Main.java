package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        String name;
        int before, after;
        boolean checker = false;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=1; i<=n;i++){
            sc.reset();
            name = sc.next();
            sc.reset();
            before = sc.nextInt();
            after = sc.nextInt();

            if(before >= 2400 && after>before)
                checker = true;


        }

        if(checker)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
