package main.arrays.one_D;

public class Basic {
    public static void main(String[] args) {

        int a[] = new int[5];

        a[0] = 10;

        a[1] = 200;

        a[2] = 5;

        a[3] = 7;

        a[4] = 19;

     /*   System.out.println(a[2]);
        System.out.println(a[4]);

        a[3] = 30;

        System.out.println(a[3]);

      */



        /*for (int i=0; i<5; i++){
// i<size here above in for loop

            System.out.println(a[i]);
        }*/


      /*  int n = a.length;

        System.out.println(n);

       */



        int n = a.length;

        System.out.println(n);

        for (int i=0; i<n; i++){

            System.out.print(a[i] + " ");
        }



    }
}
