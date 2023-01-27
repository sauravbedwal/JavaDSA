package TimeAndSpaceComplexities;

//store numbers from 0 to n inside a array
public class Space {
    public static void main(String[] args) {

        /*int n = 10;

        //T=> O(n)
        //S=> O(n)
        //as we added a array which take space and also depending on input.
        //like n=10 so an array of size 10 formed if n=5 then an array of size 5 will form.



        int a[] = new int[n];
        for (int i=0; i<n; i++){
            a[i] = i+1;

            //System.out.println(i);

        }

        for (int i=0; i<n; i++) {

            System.out.println(a[i] + " ");
        }

         */

        //store numbers from 1 to n^2 inside a 2D array
        //which means if n =5 then we want 25 output.


        int n = 5;

        //T=> O(n^2)
        //S=> O(n^2)


        //here int k, int i, int j they also taking some space and for that T => O(C) or O(1).
        //bcoz here k, i, and j value is same is constant.

        int a[][] = new int[n][n];

        int k = 1;

        for(int i=0; i<n; i++){
            for (int j=0; j<n;j++){
                a[i][j] = k;
                k++;
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }


    }
}
