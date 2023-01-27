package main.Recursion;

//Merge Array (assignment question)
//two pointers concept

public class TwoPointers {
    public static void main(String[] args) {

        int a[] = {1, 4, 7, 20, 30};
        int n = a.length;

        int b[] = {1, 3, 3, 9};
        int m = a.length;



        int i=0;
        int j=0;
        int k=0;


        int c[] = new int[n+m];


        while(i<n && j<m){

            if(a[i] == b[j]){

                c[k] = a[i]; i++; k++;
                c[k] = b[j]; j++; k++;
            }

            else if(a[i] < b[j]){
                c[k] = a[i]; i++; k++;
            }

            else{
                c[k] = b[j]; j++; k++;
            }

        }

        while(i<n){
            c[k++] = a[i++]; //we can write a[i]; i++ as a[i++] also
        }
        while(j<m){
            c[k++] = b[j++];
        }

        for(k=0; k<n+m; k++){
            System.out.print(c[k] + " ");
        }


    }
}
