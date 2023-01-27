package main.arrays.two_D;


import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxValue {
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

        int max = Integer.MIN_VALUE;

        System.out.println("Values Entered are: ");

        for (int i=0; i<r; i++){

            for(int j=0; j<c; j++){

                System.out.print(a[i][j] + " ");

                if (a[i][j] > max){
                    max = a[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Value inside Matrix is:  " + max);
    }
}
