package main.Basic;


//Starting codes kind of INTRO.

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

    }
