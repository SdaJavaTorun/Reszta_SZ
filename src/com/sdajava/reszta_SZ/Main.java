package com.sdajava.reszta_SZ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] nominaly =
                {200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj Reszte");

        int reszta = sc.nextInt();

        while (reszta > 0){
            if ( reszta >= nominaly[i]){
                int L = reszta/nominaly[i];
                reszta = reszta - (nominaly[i]*L);
                System.out.println(L +" razy po " + nominaly[i] + "zl");

            }else
                i = i + 1;
        }

    }
}
