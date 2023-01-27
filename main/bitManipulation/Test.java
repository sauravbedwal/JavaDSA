package main.bitManipulation;

public class Test {
    /*public static void main(String[] args) {
        
        //  in this code we use & whihch is similar to multiplication and if we convert decimal 10 into binary it will
        //  be 1010 and 6 will be 110 which we can also write lile 0110 and then if we do 1010 & 0110 we will get 10
        //which is as per the property is 2.

        int x = 10;
        int y = 6;
//        int n = 6; // for left & right shift


        System.out.println(x & y); // & (multiply)
        System.out.println(x | y); // | (add)
        System.out.println(x ^ y); // ^ XOR  different 1(true) same 0(false).



        System.out.println(10 << 1); //left shift 1 time  and when we convert 10 into binary then 20 coming in decimal
        System.out.println(10 >> 1); // right shift 1 time and when we convert 10 into binary then 5 coming in decimal
        System.out.println(10 >> 2);// right shift 2 time and when we convert 10 into binary then 2 coming in decimal
        System.out.println(10 >> 3); //// right shift 3 time and when we convert 10 into binary then 1 coming in decimal

        System.out.println(~10);  //complement of +x = -(x+1)
        System.out.println(~(-10)); //complement of -x = +(x-1)

    }

     */

//


    public static void main(String[] args) {

//        int x = 14;
//
//        //Multiply by 2
//        System.out.println(x << 1);
//
//        //Divide by 2
//        System.out.println(x >> 1);
//
//        //Even Or Odd
//        if((x & 1) == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }


        //Set Bit
        int y = 38;
        int n = 5;
//        System.out.println(y | (1 << n));
//
//        //UnSet Bit
//        System.out.println(y & (~(1 << n)));


        //Toggle Bit
        System.out.println(y ^ (1 << n));
    }
}


