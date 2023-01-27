package main.maths;

public class GCD {
    public static void main(String[] args) {

        int x = 12;
        int y = 16;

        int hcf = 0;

        for (int i=1; i<=x; i++){

            if (x%i == 0 && y%i == 0){

                hcf = i;

            }

        }   
        System.out.println(hcf);

    }

}
