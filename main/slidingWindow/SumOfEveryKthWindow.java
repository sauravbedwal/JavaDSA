package main.slidingWindow;

public class SumOfEveryKthWindow {
    public static void main(String[] args) {

        //in this code we doing sum of every kth window
        /*int a[] = {10, 3, -1, 5, 9, 2, 1};
        int n = a.length;

        int k = 3;

        int sum  = 0;

        for (int i=0; i<k; i++){
//            sum = sum + a[i];
            sum += a[i];
        }

        System.out.print(sum + " ");

            for (int i=k; i<n; i++) {
                sum += a[i];
                sum -= a[i - k];

                System.out.print(sum + " ");
            }

         */

        //in this code we doing same thing like above i.e. sum of every kth window in one for loop for better time comp.

        int a[] = {10, 3, -1, 5, 9, 2, 1};
        int n = a.length;

        int k = 3;

        int sum  = 0;

        for (int i=0; i<n; i++){

            if (i == k){
                System.out.print(sum + " ");
            }
            sum += a[i];

            if (i >= k){

                sum -= a[i-k];
                System.out.print(sum + " ");
            }
        }
    }
}
