package Searching;

public class LinearSearch {
    public static void main(String[] args) {

        int a[] = {10, 50, 70, 5, 9, 100, 9, 45, 9};
        int n = a.length;

        int x = 5000;


        //code for searching the element and printing index of it.

        /*for(int i=0; i<n; i++){

            if(a[i] == x){
                System.out.println(i);
            }
        }

         */

        //code for searching an element which is not present in array and have to print NOT FOUND!

        /*int count =0;

        for (int i=0; i<n; i++){

            if (a[i] == x){

                System.out.println("Elements found at index:" + i);
                count++;

            }
        }

        if (count == 0){
            System.out.println("Elements not found");
        }

         */


        //code for searching an element which is not present in array using FLAG(boolean found= false) and have to
        // print NOT FOUND!

        /*boolean found = false;

        for (int i=0; i<n; i++){

            if (a[i] == x){

                System.out.println("Elements found at index:" + i);
                found = true;

            }
        }
        if (found == false){
            System.out.println("Elements not found");
        }

         */

        //Condition - Element is only present at once.
        // as element present at once in the array then there is no need to search further if we found the element.
        //let say a[]={10, 50, 30, 40, 11} so here if we finding 30 then once we got 30 at a[2] no need to search further.
        //so this code is using break.


        /*boolean found = false;

        for (int i=0; i<n; i++){

            if (a[i] == x){

                System.out.println("Elements found at index:" + i);
                found = true;
                break;

            }
        }
        if (found == false){
            System.out.println("Elements not found");
        }

         */



        //Condition - Element is only present at once.
        // as element present at once in the array then there is no need to search further if we found the element.
        //let say a[]={10, 50, 30, 40, 11} so here if we found 30 then once we got 30 at a[2] no need to search further.
        //and if we unable to find the element then i = n.
        //so here in this code we used break and we also change the if condition at last.

        int i = 0;
        //initialised i outside the loop bcoz we took same variable i.e. i outside the loop also while comparing it by n.
        for(; i<n; i++){

            if(a[i] == x){
                System.out.println("Elements found at index:" + i);
                break;
            }
        }
        if(i == n){
            System.out.println("Elements not found!!");
        }

    }
}
