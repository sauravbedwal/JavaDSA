package main.prefixArray;

//prefix array :  finding prefixSum
public class Test {
    public static void main(String[] args) {

        /*int a[] = {5, 1, 3, 2, 4};
        int n = a.length;

        int prefixSum[] = new int[n];

        prefixSum[0] = a[0];

        for (int i=1; i<n; i++){

            prefixSum[i] = prefixSum[i-1] + a[i];
        }


        for (int i=0; i<n; i++){

            System.out.print(prefixSum[i] + " ");
        }

    }
}

         */


//we can do the code like this also
//in this code we applied if else condition as if we want to use randomly values like 11, 6 and 5


    /*int a[] = {5, 1, 3, 2, 4};
    int n = a.length;

    int prefixSum[] = new int[n];


        for (int i=0; i<n; i++) {

            if (i == 0) {
                prefixSum[0] = a[0];
            } else {
                prefixSum[i] = prefixSum[i - 1] + a[i];
            }
        }


        for (int i=0; i<n; i++){

        System.out.print(prefixSum[i] + " ");
        }

        }
        }

     */

         //in this code we getting prefixArraySum
        //if we want values just consecutively then we can do it by taking variable sum and just adding values to it

        int a[] = {5, 1, 3, 2, 4};
        int n = a.length;

        int prefixSum[] = new int[n];


        int sum = 0;
        for (int i=0; i<n; i++){

            System.out.print((sum += a[i]) + " ");
        }

    }
}






