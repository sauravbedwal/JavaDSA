package main.kadane;

public class LargestSumContiguousSubarray {

    public static void main(String[] args) {

        //int a[] = {-3, 4, -2, 7, 0, 1};
        int a[] = {-4, -2, -7, -9}; //here we took an array with all -ve no. to understand that max cant be 0 bcoz
        //bcoz if its 0 then in case of -ve no.it has to show -2 as correct ans but it will always show 0 which is wrong
        int n = a.length;

        int sum = 0;
        int max = Integer.MIN_VALUE;
    //    int max = 0;   // and if we take same array -ve no but take max as Integer.MIN_VALUE then ans will be right.
        //hence max either be Integer.MIN_VALUE or the first element of array

        for (int i=0; i<n; i++){

            sum += a[i];     //sum = sum + a[i] we can write like this too as both r same.
            max = Math.max(max, sum);     // instead of that we can put if condition which is mentioned below

//            if(sum > max){
//
//                max = sum;
//            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);

    }
}
