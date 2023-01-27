package main.arrays;

//related to kadence also

public class SubArray {
    public static void main(String[] args) {

        //here in this code we printing all the subarays
        //T => O(n^3)

        int a[] = {0, 1, 2, 3};
        int n = a.length;

        for (int s=0; s<n; s++){
            for (int e=s; e<n; e++){
                for (int i=s; i<=e; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }

        }



        //in this code  we printing all the subarrays and sum also.
        //T => O(n^3) bcoz we printing subarrays and sum.


        //int a[] = {4, 2, 3};
       // int n = a.length;

        /*for (int s=0; s<n; s++){
            for (int e=s; e<n; e++){

                int sum = 0;
                for (int i=s; i<=e; i++){

                    sum += a[i];

                    System.out.print(a[i] + " ");
                }
                System.out.println(">>>>" + sum);
            }

        }*/

         //SubarraySum
        // in this code  we want to calculate sum and no need to print the subarrays.
        // T => O(n^2) bcoz only need to print the sum

        /*for (int s=0; s<n; s++){

            int sum = 0;

            for (int e=s; e<n; e++){

                sum += a[e];
                System.out.println(sum);
            }
        }*/

    }

}
