package main.bigInteger;

import java.math.BigInteger;

public class BigintegerTest {
    public static void main(String[] args) {

        String str = "8955795258";

        BigInteger num = new BigInteger(str);
        BigInteger seven = new BigInteger("7");
        BigInteger zero = new BigInteger("0");

        BigInteger remainder = num.mod(seven);
        // System.out.println(remainder);

        if(remainder.equals(zero))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
