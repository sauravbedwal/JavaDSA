package main.hashing;

public class TestInMainPartOne {
    public static void main(String[] args) {

        //int a[] = {10, 23, 45, 14, 78};
        String a[] = {"Ravi", "Mohan", "Sham"};

        //this for loop is the one we use to print all no. from starting to end and
        //we can choose the starting point, ending point and print in reverse too.

        /*int n = a.length;

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }

         */

        //enhance for loop here it will start from starting we cant change starting point or ending point and cant print
        //in reverse order.
        //here X is the values which is a[i] and a is name of array.
        //there are two examples here int x and string str.

        /*for(int x : a){
            System.out.print(x + " ");
        }

         */
        for(String str : a){
            System.out.print(str + " ");
        }
    }
}
