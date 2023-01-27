package main.maths;

public class Factors {
    public static void main(String[] args) {

        int n = 12;

        // found the factors code below

        /*for (int i=1; i<=n; i++){

            if(n%i == 0){
                System.out.println(i);
            }
        }

         */


        // found the factors and Count the factors also below

        int count = 0;

        for(int i=1; i<=n; i++){

            if (n%i == 0){


                System.out.println(i);
                count++;
            }

        }
        System.out.println("No. of Factors: " + count);
    }
}
