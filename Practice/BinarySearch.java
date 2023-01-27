package Practice;

public class BinarySearch {
    public static void main(String[] args) {


        //able to print index which r more than m but for less than m it showing not found as they r present

        int a[] = {24, 45, 6, 32, 55, 78, 9, 12};
        int n = a.length;

        int x = 6;

        int l = 0;
        int r = n-1;

        while(l<=r){

            int m = l + (r-l)/2;

            if(a[m] == x){
                System.out.println(m);
                break;
            }
            else if (x < a[m]){
                r = m-1;
            }
            else{
                l = m+1;
            }
        }

        if(l>r){
            System.out.println("Not found!!!");
        }

    }


}

