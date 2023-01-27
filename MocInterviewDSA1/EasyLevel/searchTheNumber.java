package MocInterviewDSA1.EasyLevel;

public class searchTheNumber {

    public static void main(String[] args) {

        int a[] = {5, 2, 1, 7, 3};
        int n = a.length;

        int x = 10;
        int count = 0;

        for(int i=0; i<n; i++){


            if(a[i] == x){

                System.out.println("Present");
                count++;
                break;
            }

        }
        if(count == 0) {
            System.out.println("Not present");
        }

    }
}
