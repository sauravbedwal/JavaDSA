package main.prefixArray;

public class SubarraysWithOddSum {
    public static void main(String[] args) {

        //in this code we did the subarray with odd sum and print no. of odd sums
        // by just counting the odd no. in the subarraySum code

        int a[] = {4, 2, 3};
        int n = a.length;

        int count = 0;
        for (int s=0; s<n; s++){

            int sum = 0;


            for (int e=s; e<n; e++){

                sum += a[e];

                if(sum % 2 != 0){
                    count++;
                }

            }

        }
        System.out.println(count);

    }
}
