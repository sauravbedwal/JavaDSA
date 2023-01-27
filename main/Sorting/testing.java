package main.Sorting;

public class testing {

    //First two - Modulo Arithmatics - In Class
//https://my.newtonschool.co/playground/code/xxowkpsskxw0/
// in this code doing it with string method for own understanding


    /*public static void main(String[] args) {

        int n = 3423;

        String str = Integer.toString(n);

        char f = str.charAt(0);
        char s = str.charAt(1);

        System.out.print(s);
        System.out.print(f);

         }

     */

    //in this code understanding call by value.

    /*static void fun(int x){  //we can write int a also instead of int x.
        x = 50; // a = 50;
    }

    public static void main(String[] args) {

    //call by value : value passed as parameters and original variables not affected. ex - int , boolean.


        int x = 10;
        System.out.println(x);
        fun(x);
        System.out.println(x);
    }

     */


    //in this code understanding call by reference.
    static void funArray(int a[]){ // we can write int b also instead of int a. We can change the name

         a[0] = 10; //b[0]
         a[1] = 20; //b[1]
         a[2] = 30; //b[2]

    }

    public static void main(String[] args) {

        //call by reference  : addresses passed as parameters and original variables get changed. ex - arrays, objects
        int a[] = {1, 2, 3};
        int n= a.length;

        for (int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        funArray(a);
        System.out.println();
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
