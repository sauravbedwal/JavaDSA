package main.arrays.two_D;

public class Basic {
    public static void main(String[] args) {

        /*int a[][] = new int[3][3];

        a[1][2] = 70;

        System.out.println(a[1][2]);

         */

        int a[][] = new int[2][2];

        int r = a.length;
        int c = a[0].length;

        a[0][0] = 20; a[0][1] = 30;
        a[1][0] = 50; a[1][1] = 60;

        for (int i=0; i<r; i++){

            for (int j=0; j<c; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
