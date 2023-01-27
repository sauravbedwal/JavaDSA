package main.arrays.two_D;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int r = sc.nextInt();

        System.out.println("Enter the columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter " + r*c + " numbers: ");

        for (int i=0; i<r; i++){

            for(int j=0; j<c; j++){

                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n\nValues Entered are: ");

        for (int i=0; i<r; i++){

            for (int j=0; j<c; j++){

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

    }
}
