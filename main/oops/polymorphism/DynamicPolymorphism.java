package main.oops.polymorphism;

//in this code we learnt abt overriding.

/*class Vehicle{
    void brakes(){
        System.out.println("Breaks Applied");
    }
}

class Bike extends Vehicle{

//        void brakes(){
//        System.out.println("Disc Brakes!!!");
//    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {

//        Vehicle v = new Vehicle();  //when we do v.brakes and above both Vehicle and Bike class r active no comment
//        v.brakes();                //down inside it then it will go to Vehicle class and print Brakes applied.

        Bike b = new Bike();  //when we do b.brakes and above both Vehicle and Bike class r active no comment
        b.brakes();           //down inside it then it will go to Bike class and print Disc Brakes.

        // but if we did b.brakes and above in Bike class there is no brakes method then it will look into the parent
        // class and print Brakes applied as Bike is derived class of Vehicle so it wll get the feature of Vehicle class
        //and as in Vehicle class there is brakes method so it will get in that due to b.brakes and print Brakes Applied.

        //but if WE created own brake method in Bike class then it will override the previous brake method of Vehicle
        // class.
    }
}

 */


//in this code we learned abt Dynamic Polymorphism.


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Vehicle{
    void brakes(){
        System.out.println("Breaks Applied");
    }
}

class Bike extends Vehicle{

        void brakes() { System.out.println("Disc Brakes!!!"); }
}

class Aeroplane extends Vehicle{

    void brakes(){
        System.out.println("Hydraulic Brakes");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {

//        Vehicle v = new Vehicle();
//        v.brakes();

//        Bike b = new Bike();
//        b.brakes();

//        Aeroplane a = new Aeroplane();
//        a.brakes();


        //here we choosed vehicle but which vehicle bike or aeroplane that is deciding at run time as at compile time
        // we deciding that there will be a vehicle but which vehicle it will decide at run time.

//        Vehicle v1 = new Bike();
//        v1.brakes();
//
//        Vehicle v2 = new Aeroplane();
//        v2.brakes();

//        Vehicle x;
//
//        x = new Bike();  //we can decide later anytime that which vehicle we want as its happening dynamically
//        x = new Aeroplane();  //at the time of run time
//        x = new Vehicle();

        Map<Integer, String> map;

        map = new TreeMap<>();
        map = new HashMap<>();
        map = new LinkedHashMap<>();

    }
}
