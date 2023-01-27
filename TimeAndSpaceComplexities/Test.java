package TimeAndSpaceComplexities;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // here in this code if we take any input like 100 or 10 or 1000
        // there will be no change in the time bcoz input doesn't depend on the below 4 lines.
        // if below 4 lines taking let say 4 sec they will take 4 sec only time will be constant.

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int x;
        int y = 10;
        String str = "Ravi";
        x = y;


         */


        //in this code also time will be constant bcoz it doesn't depend on input.
        //as ravi gonna print 3 times and let say it take 1 sec then it gonna be constant.

        /*int n = 10;

        System.out.println("Ravi");
        System.out.println("Ravi");
        System.out.println("Ravi");


         */


        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //as n=10 let say it takes 10 sec when input will be 100 it will take 100 sec or
        // when input will be 1000 it will take 1000 sec
        //depending on input the time will change(increase/decrease) so here time complexity is O(n).


        /*int n = 10;

        for (int i = 0; i<n; i++){

            System.out.println("Ravi");
        }

         */

        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(n²).

        /*int n = 5;

        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }

         */

        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(2n).
        // hence we can ignore the 2 and write it as O(n) also bcoz 2n is not much difference than n
        // but n² have big difference than n.

        /*int n = 3;

        for (int i=0; i<n; i++){
                System.out.println(i);
        }

        for(int j=0; j<n; j++){
            System.out.println(j);
        }

         */

        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(n²).
        //bcoz there are 4 ittrations in the output means we print 4 times so first row we print 1 time
        // then in second row we print 2 times and smw goes till 4th line we print 4 times.
        //and 1+2+3+4......n is sum of natural no. and for that we have a formula : n(n+1)/2
        //n²+n/2 = n²/2 + n/2 = n² (here we can ignore n/2 bcoz it is very less no. and we can also neglect /2
        //below n² as its constant.



        /*int n = 5;

        for(int i=1; i<n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

         */


        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(n).
        //here in loop we incrementing by 2 therefore input is 10 but we got output 5 which means
        //input n but output n/2. and as 2 is constant we ignore that so we got n.



        /*int n = 10;

        for(int i=0; i<n; i+=2){
            System.out.println(i);
        }

         */

        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(n).
        //here  loop running twice of input therefore input is 10 but we got output 20 which means
        //input n but output 2n. and as 2 is constant we ignore that so we got n.

        /*int n = 10;

        for(int i=0; i<n*2; i++){
            System.out.println(i);
        }

         */

        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(n).
        //here  loop running thrice of input therefore input is 4 but we got output 12 which means
        //input n but output 3n. and as 3 is constant we ignore that so we got n.

        /*int n = 4;

        for(int i=0; i<=n*3; i++){
            System.out.println(i);
        }

         */


        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(n²).
        //here  loop running n*n of input therefore input is 4 but we got output 16 which means
        //input n but output n².

        /*int n = 4;

        for(int i=0; i<=n*n; i++){
            System.out.println(i);
        }

         */


        //O(2^n) example (increasing). Increasing Exponentially.
        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(2^n).
        //here  loop running 2^n which means 2^5 = 2*2*2*2*2 = 32.
        //here its printing 32 times bcoz 2^5 so its increasing.



       /*int n = 5;

        for(int i=1; i<=Math.pow(2, n); i++){
            System.out.println(i);
        }

        */


        //O(log n) example (decreasing).  Decreasing Exponentially.
        //in this code time is not fixed bcox it depends on the input so itd not constant.
        //depending on input the time will change(increase/decrease) so here time complexity is O(log n).
        //here  loop increasing i*=2 which means 32/2 = 16, 16/2 = 8, 8/2 = 4, 4/2 = 2, 2/2 = 1 it took 5 outputs.
        //here in output it showing the itrations (which means no. of times it print).
        //here its printing 5 times so its decreasing.


        /*int n = 32;

        for (int i = 1, k = 1; i < n; i *= 2, k++) {
            //k is to print no. of itrartions.
            System.out.println(k);

        }

         */


        //here in this code we asked what is best, worst and avg time complexity for this code.
        //then it would be O(n) bcoz itd just simply printing the output depending upon input.

        int n = 10;

        for(int i=0; i<n; i++){
            System.out.println("Ravinder");
        }
    }
}

