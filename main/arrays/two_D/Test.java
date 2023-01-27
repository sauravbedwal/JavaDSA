package main.arrays.two_D;

public class Test {
    public static void main(String[] args) {

        int a[][] = { {23, 34, 56}, {12, 34, 12} };

        int r = a.length;
        int c = a[0].length;

        for (int i=0; i<r; i++){

            for(int j=0; j<c; j++){

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
