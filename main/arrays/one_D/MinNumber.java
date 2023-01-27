package main.arrays.one_D;

public class MinNumber {
    public static void main(String[] args) {

        //int arr[] = {20, 50, 8, 10, 6};

        int arr[]= {-10, -20, -30};
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        System.out.println(min);

        for (int i=0; i<n; i++){

            if (arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println(min);


    }
}
