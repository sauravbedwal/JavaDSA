package Practice;

/*public class Sorting {
    public static void main(String[] args) {

        //Insertion sort

        int a[] = {5, 2, 1, 7, 3};
        int n = a.length;

        for (int i = 1; i < n; i++) {

            int key = a[i];

            int j = i - 1;
            for (; j >= 0; j--) {

                if (a[j] >= key) {
                    a[j + 1] = a[j];
                } else {
                    a[j + 1] = key;
                    break;
                }
            }
            if (j < 0) {
                a[0] = key;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}

 */

        //Bubble Sort


/*public class Sorting {
    public static void main(String[] args) {

        int a[] = {5, 2, 1, 7, 3};
        int n = a.length;

        for(int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){

                if(a[j] > a[j+1]){

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }

 */



        //Merge Sort


public class Sorting {

    static void merge(int a[], int l, int m, int h){

        int n1 = m-l+1;
        int n2 = h-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy elements from a to L

        for (int i=0; i<n1; i++){

            L[i] = a[l+i];           //a[o+o] => a[0] value then a[0+1] => a[1] value so on
        }

        //copy elements from a to R

        for (int i=0; i<n2; i++){

            R[i] = a[m+1+i];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){

            if(L[i] == R[j]){

                a[k] = L[i]; i++; k++;
                a[k] = R[j]; j++; k++;
            }
            else if(L[i] < R[j]){
                a[k] = L[i]; i++; k++;
            }
            else{
                a[k] = R[j]; j++; k++;

            }
        }

        while(i < n1){
            a[k++] = L[i++];
        }
        while (j < n2){
            a[k++] = R[j++];

        }




    }
 static void divide(int a[], int l, int h){

     int m = (l+h)/2;

     if(l<h) {

         divide(a, l, m);
         divide(a, m + 1, h);
         merge(a, l, m, h);
     }
        }


    public static void main(String[] args) {

        int a[] = {5, 8, 9, 6, 5, 4, 32, 7};
        int n = a.length;

        divide(a, 0, n-1);
        for (int i=0; i<n; i++){

            System.out.print(a[i] + " ");
        }


    }
}



