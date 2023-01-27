package main.maths;

public class LCM {
    public static void main(String[] args) {

        int x = 12;
        int y = 9;

        int hcf = 0;

        int lcm;

        for (int i=1; i<=x; i++){

            if(x%i == 0 && y%i ==0){

                hcf = i;

            }
        }

        lcm = (x*y)/hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

}
