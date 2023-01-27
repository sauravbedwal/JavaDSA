package main.Basic;

//starting codes kind of INTRO.
//// Sum of Digits in a number

public class Test {

    public static void main(String[] args) {

        int n = 1024;

        int sum = 0;

        while(n > 0){

            int r = n%10;

            n = n/10;

            sum = sum + r;

// System.out.println(r);

        }

        System.out.println(sum);

    }

}







/*package main;
public class TestPartOne {

    // Reverse a number

    public static void main(String[] args) {

        int n = 1024;

        int rev = 0;

        while(n > 0){

            int r = n%10;

            n = n/10;

            rev = (rev * 10) + r;

        }

        n = rev;

        System.out.println(n);

    }

}*/

