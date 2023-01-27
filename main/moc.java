package main;

public class moc {
    public static void main(String[] args) {

        int a[] = {6, 7, 5, 2, 3, 4};
        int n  = a.length;

        for (int i=0; i<n-1; i++){

            int max = Integer.MIN_VALUE;
            for (int j=i+1; j<n; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            System.out.print(max + " ");
        }

        }
    }
