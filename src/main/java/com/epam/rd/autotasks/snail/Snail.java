package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // read a
        int b = scanner.nextInt(); // read b
        int h = scanner.nextInt(); // read h

        int days = (h - b - 1) / (a - b) + 1; // calculate days using formula

        if (a <= b || days <= 0) {
            System.out.println("Impossible"); // cannot reach the top
        } else {
            System.out.println(days); // print number of days
        }
    }
}
