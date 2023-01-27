package main.arrays.one_D;

import java.util.Scanner;

public class Basic_PartOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Limit: ");
        int n = sc.nextInt();

        int a [] = new int[n];

        System.out.println("Enter " + n + " numbers: ");

        for (int i=0; i<n; i++){

            a[i] = sc.nextInt();

        }

        System.out.println("\n\nValues Entered are: " );

        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");
        }
    }
}
