package main.modulo;

public class Exponentiation {
    /*public static void main(String[] args) {


        //in this code we have 2^5 and we solving it by loop.

        int a = 2;
        int b = 5;

        int prod = 1;

        for(int i=0; i<b; i++){

            prod = prod * a;

        }
        System.out.println(prod);

    }

     */

    //in this code we have 2^5 and we solving it by recursion.
    // T => O(b)

    /*static int power(int base, int exponent){

        int prod = 1;
        for(int i=0; i<exponent; i++){

            prod = prod * base;
        }

        return prod;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 3;

           //we can ignore above 2 lines int a and int b and directly print sout.

        System.out.println(power(3,3));

    }

     */

    //in this code we have 2^8 and we solving it by recursion.
    //in which 2^8 => (2^2)^4 = (4)^4 => (4^2)^2 = (16)^2 = 256
    //T => O(log n)


    /*static int powerBetter(int base, int exponent) {

        int prod = 1;

        while (exponent > 1) {

            if (exponent % 2 == 1) {

                prod = base * prod;
            }

            base = base * base;
            exponent = exponent / 2;

            prod = prod * base;
        }
        return prod;

    }

    public static void main(String[] args) {

        int a = 3;
        int b = 3;


        //we can ignore above 2 lines int a and int b and directly print sout.

        System.out.println(powerBetter(3,3));

    }

     */

    //in this code we apply the modulo arithmatic property.i.e. (a*b)%c = ((a%c)*(b%c))%c
    //we have to use this only when it is given in question. like this code m = 7.


    //T=. O(n) (exponent)
    static int power(int base, int exponent, int m){

        int prod = 1;
        for(int i=0; i<exponent; i++){

            prod = ((prod % m)  * (base % m)) % m;
        }

        return prod;
    }



    //T=> O(log n) (exponent)
    static int powerBetter(int base, int exponent, int m) {

        int prod = 1;

        while (exponent > 1) {

            if (exponent % 2 == 1) {

                prod = ((base % m) * (prod % m)) % m;
            }

            base = ((base % m) * (base % m)) % m;
            exponent = exponent / 2;

            prod = ((prod % m) * (base % m));
        }
        return prod;

    }

    public static void main(String[] args) {


//        int a = 3;
//        int b = 3;
        //we can ignore above 2 lines int a and int b and directly print sout.

        int m = 7;


        System.out.println(power(3,3, 7));
        System.out.println(powerBetter(3,3, 7));

    }

}
