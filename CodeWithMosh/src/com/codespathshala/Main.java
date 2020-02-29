package com.codespathshala;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world.!");
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[3] = 3;
        System.out.println(Arrays.toString(numbers));

        String PI = "3.1416";
        double onePlusPI = Double.parseDouble(PI) + 2;
        System.out.println(onePlusPI);

        // mortgage calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Annual Interest rate: ");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Period (years): ");
        double period = sc.nextDouble();
        double r = (annualInterestRate / 100) / 12;
        double n = period * 12;
        double one_plus_r = 1 + r;
        double pow_one_plus_r = Math.pow(one_plus_r, n);
        double m = p * ((r * pow_one_plus_r)/(pow_one_plus_r - 1));
        String result = NumberFormat.getCurrencyInstance().format(m);
        System.out.println("Mortgage: " + result);


    }
}
