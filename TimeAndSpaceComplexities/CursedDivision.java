package TimeAndSpaceComplexities;


//we need to put output a array in which in every index except the no. of that index every other no. will be mutiplied

public class CursedDivision {

    public static void main(String[] args) {

        int a[] = {2, 4, 1, 3, 5};
        int n = a.length;



        for (int i=0; i<n; i++){
            int prod = 1;
            for(int j=0; j<n; j++){

                if(i!=j) {

                    prod = prod * a[j];
                }

            }
            System.out.println(prod + " ");

        }

    }

}
