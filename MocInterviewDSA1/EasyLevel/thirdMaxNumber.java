package MocInterviewDSA1.EasyLevel;

public class thirdMaxNumber {
    public static void main(String[] args) {


        //this will work only if one no. is not repeating again

        int a[] = {1,2,3,4,5};
        int n = a.length;

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){

            if(a[i] > max){
                max = a[i];
            }
        }
        //System.out.println(max);

        for (int i=0; i<n; i++){

            if (a[i] > max2 && a[i] < max){

                max2 = a[i];
            }
        }
       //System.out.println(max2);

        for (int i=0; i<n; i++){

            if(a[i] > max3 && a[i] < max2){

                max3 = a[i];
            }

        }

        System.out.println(max3);

    }
}
