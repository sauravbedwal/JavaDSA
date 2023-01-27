package main.maths;


// Remainder Method
public class EuclidGCD {
    public static void main(String[] args) {

        int x = 12;
        int y = 8;

        int a = x;
        int b = y;

        int hcf = 0;

        int lcm;

        while (x>0 && y>0){

            if (x > y){

                x = x % y;
                hcf = y;
            }
            else {
                y = y % x;
                hcf = x;

            }
        }
        lcm = (a*b)/hcf;

        System.out.println("LCM: " + lcm);
        System.out.println("HCF: " + hcf);
    }
}
