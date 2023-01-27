package MocInterviewDSA1.MediumLevel;

//Problem 1: Given an integer array nums, return the third distinct maximum number in this array. If the third maximum
// does not exist, return the maximum number.
//Input: nums = [3,2,1]
//Output: 1
//Input: nums = [1,2]
//Output: 2
import java.util.Scanner;

public class ThirdMaxNumber {
    public static void main(String[] args) {


        int a[] = {3, 2,};
        int n = a.length;

       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        //int n = a.length;

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }*/

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){

            if (a[i] > max){
                max = a[i];
            }
        }

        for (int i=0; i<n; i++){

            if (a[i] > max2 && a[i] < max){
                max2 = a[i];
            }
        }

        for (int i=0; i<n; i++){

            if (a[i] > max3 && a[i] < max2){
                max3 = a[i];
            }
        }
        if(n<=2){
            System.out.println(max);
        }
        else {
            System.out.println(max3);
        }

        /*int max = a[0];
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i=1; i<n; i++){

            if (a[i] > max){
                max3 = max2;
                max2 = max;
                max = a[i];
            }
            else if (a[i] > max2){

                max3 = max2;
                max2 = a[i];
            }
            else if (a[i] > max3){
                max3 = a[i];
            }
        }
        System.out.println(max3);

         */

    }
}
