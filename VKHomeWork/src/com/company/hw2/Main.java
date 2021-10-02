package com.company.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pattern string: ");
        String pattern = scanner.nextLine();

        while(true){
            System.out.println("Enter a string");
            String str=scanner.nextLine();
            if(str.equals("exit")) {
                System.out.println("Bye");
                return;
            }
            if( occursIn(pattern, str)) {
                System.out.println(pattern+" occurs in"+ " ^^ " + str+ " ^^  ");
            }else {
                System.out.println(pattern+" does NOT occur in"+ " ^^ "+ str+ " ^^ ");
            }

    }
}

    private static boolean occursIn(String pattern, String str) {
        String patternNew ="  ";
        for(int i=0;i<pattern.length();i++) {
            if(pattern.charAt(i)!=('*')) {
                patternNew += pattern.charAt(i);
            }
        }


        return false;
    }
  }
