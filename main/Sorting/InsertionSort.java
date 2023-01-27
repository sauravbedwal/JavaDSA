package main.Sorting;


public class InsertionSort {
    public static void main(String[] args) {

        //question by instructor by his own
        //here value will be at last only that we need to sort


        /*int a[] = {4, 7, 9, 15, 21, 11};
        int n = a.length;

        int key = a[n-1];

        int j=n-2;
        for(; j>=0; j--){
            if(a[j] > key){ // here initialised the loop by j=n-2 but in if condition taking a[j] which means a[n-2]and
                a[j+1] = a[j]; //a[j+1] means a[n-1] so we just put values of j and wrote here in short form.
            }
            else{
                a[j+1] = key;
                break;
            }
        }

        if(j<0){
            a[0] = key; //a[j+1]
        }

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }

         */

        //Insertion Sort main question
        //T=> O(n^2) as ittraton will be sum of natural no.

        int a[] = {5, 2, 1, 7, 3};

        int n = a.length;

        for(int i=1; i<n; i++){
            int key = a[i];

            int j = i-1;

            for(; j>=0; j--){
                if(a[j] >= key){
                    a[j+1] = a[j];
                }
                else {
                    a[j+1] = key;
                    break;
                }
            }
            if(j<0){
                 a[0] = key;
            }

        }

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }


    }
}
