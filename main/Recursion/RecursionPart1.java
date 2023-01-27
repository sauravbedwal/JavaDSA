package main.Recursion;


//sum of natural no. by recursion

public class RecursionPart1 {

    static int funny(int i, int n){

        if(i>n){
            return 0;
        }

        return i + funny(i+1, n);


    }

    public static void main(String[] args) {

        int n = 3;
        // n=3 => 1 + 2 + 3 = 6

        int sum = funny(1, n);
        System.out.println(sum );
    }
}
