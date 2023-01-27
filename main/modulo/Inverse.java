package main.modulo;

public class Inverse {
    public static void main(String[] args) {


        //T=> O(m)
        int a = 2;
        int m = 3;
        int b = -1;

        for(int i=1; i<m; i++){

            if((a*i)%m == 1){
                //System.out.println(i); //we can print here inside the loop as well and then break or print after loop.
                b = i;
                break;
            }
        }

        System.out.println(b);

    }
}
