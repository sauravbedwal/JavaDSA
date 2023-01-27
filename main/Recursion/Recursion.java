package main.Recursion;

public class Recursion {

    /*static void wlcm(){

        System.out.println("Welcome Everyone!");
    }

    static void happy(){
        System.out.println("Happy!");
    }

    static void msg(String str){
        wlcm();
        //calling wlcm function in msg function.
        System.out.println(str);
        happy();

    }

    static void fun(){
        System.out.println("Ravi");
        fun();
        //as here we created fun function and called fun in fun function itself and then call fun in void main
        // then here there is no error or wrong thing but then it will work as a loop and it will print Ravi
        //till the time memory is available after that it will show error
        //calling a function/method inside its own definition is recursion which sown in fun function.
    }

    public static void main(String[] args) {
        //wlcm();
        //msg("Thank you!");
        //fun();


    }

     */

    //in this code in for loop we printing no's from 0 to n and if we want to do same thing by function
    //then we created fun function in which we put condition and print the no's from 0 to n
    //it needs to have a base condition to avoid stack overflow (running infinite times)

    /*static void fun(int i){

        if(i==10) {
            return;
        }

            System.out.println(i);
            i++;
            fun(i);


    }

    public static void main(String[] args){

        fun(0);


        /*int n = 10;
        for(int i=0; i<n; i++){
            System.out.println(i);
        }*/



    //}



    //in this code we printing no from 0 to n but we making it user friendly not hardcoded

    /*static void fun(int i, int n){

        if(i==n) {
            return;
        }

        System.out.println(i);
        i++;
        fun(i, n);


    }

    public static void main(String[] args) {

     int n = 5;

        fun(0, n);
    }*/


    //in this code we have to print no. from 1 to 10.
    // so we changed i and n value and changed if condition also
    


    /*static void fun(int i, int n){

        if(i>n) {
            return;
        }

        System.out.println(i);
        i++;
        fun(i, n);


    }

    public static void main(String[] args) {

        int n = 10;

        fun(1, n);
    }

     */



     // so we changed i and n value and but we don't want to change if condition
    //in this code we have to print no. from 1 to 10.
    // it work as do while loop



    /*static void fun(int i, int n){


        System.out.println(i);
        if(i==n) {
            return;
        }

        i++;
        fun(i, n);


    }

    public static void main(String[] args) {

        int n = 10;

        fun(1, n);
    }

     */


     //in this code if in function we print first and then check the condition and then when call in main
    //it will print at once atleast
    // it work as do while loop

    /*static void fun(int i, int n){


        System.out.println(i);
        if(i>n) {
            return;
        }

        i++;
        fun(i, n);


    }

    public static void main(String[] args) {

        int n = 10;

        fun(50, n);
    }

     */

    //

    //in this code we have to print no's in reverse order i.e n to 1


    /*static void fun(int i, int n){

        if(i==0) {
            return;
        }

        System.out.println(i);
        i--;
        fun(i, n);



    }

    public static void main(String[] args) {

        int n = 10;

        fun(10, n);
    }

     */


    //in this code we will do ++i and i+1 in fun()function  instead of i++ in above line

        /*static void fun(int i, int n){

        if(i==n) {
            return;
        }

        //i++;
            System.out.println(i);

        //fun(++i, n);
            //we can do ++i directly in fun() also instead of i++ in above line
        //but we cant do i++ in fun() bcoz it post increment

            fun(i+1, n);
          //we can do ++i directly in fun() also instead of i++ in above line


    }

    public static void main(String[] args) {

        int n = 10;

        fun(1, n);
    }

         */

    //in this code we want to print no's in reverse order without using i--
    //here i will have the value by which function started but i+1 will updated one
    //once the condition breaks it will return and as now after function we have task
    //so it will do the task which is printing no. and hence we will get no. in reverse order


    static void fun(int i, int n){

        if(i==n) {
            return;
        }

        fun(i+1, n);
        //we can do ++i directly in fun() also instead of i++ in above line

        System.out.println(i);


    }

    public static void main(String[] args) {

        int n = 10;

        fun(1, n);
    }

}


