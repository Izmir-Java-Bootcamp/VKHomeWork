package com.company.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int input = in.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print("*");

        }
        if (input % 2 == 0) {
            for (int j = 0; j < input - 2; j++) {
                System.out.println();

            }

        } else {
            int i = 0;
            int j = 0;
            if (i % 2 == 0) {
                if (j % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            if (i % 2 == 1) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("+");
                }

            }

        }
    }
}