package MocInterviewDSA1.MediumLevel;

//Interviewer asked to print the index of x integer in a sorted array that where it should has to be.


public class binary {
    public static void main(String[] args) {

        int a[] = {1,2,3,5,6,7};
        int n = a.length;

        int x = 4;

        for (int i=0; i<n; i++){

            if (x < a[i]){
                System.out.println(i);
                break;
            }
        }

        //        int l = 0;
//        int r = n-1;
        /*while (l<=r){

            int m = (l+r)/2;

            if (a[m] == x){
                System.out.println(a[i]);
                break;
            }
            else if (x < a[m]){
                r= m-1;
            }
            else{
                l = m+1;
            }
        }

         */
    }
}
