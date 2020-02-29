package com.codespathshala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int i = 1;
        System.out.print("Enter the number of line you want print: ");
        int line = sc.nextInt();
        int copyOfLine = line;
        for (int k = 0; k < line; k++) {
            for (int l = 1; l < copyOfLine; l++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
            copyOfLine--;
        }
    }
}
