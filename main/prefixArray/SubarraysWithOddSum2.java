package main.prefixArray;

public class SubarraysWithOddSum2 {
    public static void main(String[] args) {

        //in this array we did the same thing but as we need things consecutively so we remove prefix array part
        // and just did sum += a[i]
        //https://my.newtonschool.co/playground/code/7t5t7nvsjxi8/

        int a[] = {1, 3, 5};
        int n = a.length;

        long e = 0;
        long o = 0;
        long sum = 0;

        for(int i=0; i<n; i++){

            sum += a[i];

            if(sum%2 == 0)
                e++;
            else
                o++;
        }

        long  ans = o * (e+1);
        System.out.println(ans);
    }
}
