package main.maths;

//in this we only finding factors and counting factors by different method. Ignore divisible by 2 part.
// Assignment Question hardcoded
// For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2.
public class TestFactors {
    public static void main(String[] args) {

        int n = 16;

        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                int f1 = i;
                int f2 = n / i;

                if (f1 == f2) {
                    System.out.println(f1 + " ");
                    count = count + 1;
                }
                else{
                    System.out.println(f1 + " " + f2 + " ");
                    count = count +2;

                }
            }

        }
        System.out.println("No. of factors are:" + count);
    }
}