package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = myScanner.nextLine();

        System.out.print("How many hours did you work?: ");
        int hoursWorked = myScanner.nextInt();

        System.out.print("What is your pay rate?: ");
        float payRate = myScanner.nextFloat();

        float grossPay = payRate * hoursWorked;

        System.out.printf("Name: %s, Gross Pay: $%.2f", name, grossPay);

        myScanner.close();


    }
}
