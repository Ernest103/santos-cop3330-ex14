package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        final double TAX = 0.055;
        Scanner sc = new Scanner(System.in);
        double subTotal, total, taxAmount = 0.00;
        String state;

        System.out.print("What is the order amount? ");
        subTotal = sc.nextDouble();
        total = subTotal;
        System.out.print("What is the state? ");
        state = sc.next();

        if(state.toLowerCase().equals("wi"))
        {
            taxAmount = total * TAX;
            total += taxAmount;
        }

        System.out.printf("Subtotal: $%.2f\n" +
                "Tax: $%.2f\n" +
                "Total: $%.2f", subTotal, taxAmount, total);
    }
}
