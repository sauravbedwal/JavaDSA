package main.oops.accessModifiers.packageB;

//in this code we learnt abt import of class through packages and default A.M.


//import main.oops.accessModifiers.Animal;
//import main.oops.accessModifiers.Vehicle;
/*import main.oops.accessModifiers.*;


class Cat extends Animal{   //here also we created sub class Cat for inheritance and use data members of Animal
    void fun(){

//        int x = legs;  //showing error
//        eat();         //showing error
    }
}



public class TestAccessModifiers {
    public static void main(String[] args) {

        //Animal a = new Animal();   //for Animal object need to import Animal
        //Vehicle v  = new Vehicle();  //for Vehicle object need to import Vehicle

        Animal a = new Animal();    //for importing both need to put sign * for all packages
        //Vehicle v = new Vehicle();

//      int x  = a.legs;  //try to use the data members of Animal class here in TestAccessModifiers but it showing error
//      a.eat();         //try to use the data members of Animal class here in TestAccessModifiers but it showing error



    }
}

 */


//in this code we learning abt protected A.M



/*import main.oops.accessModifiers.Animal;


class Cat extends Animal{
    void fun(){

        int x = legs;   //inside the derived class we can use the data members outside the package also
        // if A.M. is protected of class(Animal)
        eat();
    }
}



public class TestAccessModifiers {
    public static void main(String[] args) {

        Animal a = new Animal();

      int x  = a.legs;  //cant use through objects in protected A.M.
      a.eat();


    }
}

 */

//in this code we r importing the public A.M. and we can see that inside the class in derived class and
// through objectives alsowe able to use it



import main.oops.accessModifiers.Animal;


class Cat extends Animal{
    void fun(){

        int x = legs;
        eat();
    }
}



public class TestAccessModifiers {
    public static void main(String[] args) {

        Animal a = new Animal();

        int x  = a.legs;
        a.eat();


    }
}