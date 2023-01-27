package MocInterviewDSA1.EasyLevel;

public class LinearSearch {
    public static void main(String[] args) {

        int a[] = {1, 5, 4, 89, 24, 7};
        int n = a.length;

        int x = 89;

        for (int i=0; i<n; i++){

            if (a[i] == x){

                System.out.println(i);
            }
        }

    }
}
