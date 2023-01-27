package main.maths;

public class CheckPrime {
    public static void main(String[] args) {

        int n = 7;

        int count = 0;

        for (int i=1; i<=n; i++){

            if(n%i == 0){
                //System.out.println(i);
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        }
            else{
            System.out.println("Not Prime");
        }
    }
}
