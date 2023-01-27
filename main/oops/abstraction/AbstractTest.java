package main.oops.abstraction;


//in this code we learning abt asbtract as here in Vehicle class we created a method brakes but we dont want to define
// it that but we want wherever Vehicle class used or Bike used (in any derived class) brakes method should use itd
// mandatory its a condition and we dont want to give brakes functionality in Vehicle class (choice)

abstract class Vehicle{   //in abstract class its our choice we can create all methods as abstract or non abstract or
                         // mixture of both also

     void horn(){
        System.out.println("POPOPOOOOOOOO!");
    }

    abstract void brakes();               //here we dont want to input anything in the brakes method and for that we can
    // use abstract but if we want to use abstract on any method then we have to use it for class as well its mandatory.
    //now we cant give it any definition({})

}

class Bike extends Vehicle{  //here when we create Bike class extends Vehicle it shows error it says either implement
                            // brakes method or make Bike class abstract and all thi due to abstract used in Vehicle
                           //  class
    void brakes(){
        System.out.println("Disc Brakes");
    }

}


public class AbstractTest {
    public static void main(String[] args) {

        Vehicle v = new Vehicle() {
            void brakes(){                               //we normally create object like Vehicle V = new Vehicle();
                System.out.println("Basic Brakes");     // but here we have to create void brakes method inside that
                                                       // also to give definition bcoz if we called v.brakes() it will
                                                      // show error bcoz in vehicle class brakes method is not defined
                                                     // and abstract
            }
        };

        v.brakes();
        }
    }

