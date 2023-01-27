package main.arrays.one_D;

public class MaxNumber {
    public static void main(String[] args) {

        //int arr[] = {10, 5, 30, 200, 9 };
        // for rest of the code above int arr[] will work

        int arr[] = {-10, -20, -30};
        int n = arr.length;

        /*int max = 0;

        for (int i=0; i<n; i++){

            if (arr[i] > max){
                max = arr[i];

            }
        }
        System.out.println(max);

         */

        int max = Integer.MIN_VALUE;
        System.out.println(max);

        for (int i=0; i<n; i++){

            if (arr[i] > max){
                max = arr[i];

            }
        }
        System.out.println(max);

    }
}
