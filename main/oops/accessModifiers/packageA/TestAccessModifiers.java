package main.oops.accessModifiers.packageA;

//in this code we are learning abt default A.M.


/*class Animal{

    //here we can call these members(values) inside its own class, inside its derived class and through abjectd also \.

    int legs; //if nothing is written in class like public int legs, private or protected then its gonna be default A.M.
    //same for void eat() also

    void eat(){
         System.out.println("EATINGGGGG!!!!!");
    }
}

class Dog extends Animal{

    void fun(){
        int l = legs;
        eat();
    }
}


public class TestAccessModifiers {
    public static void main(String[] args) {

        Animal a = new Animal();
        int l = a.legs;
        a.eat();


    }
}

 */

//in this code we learning abt protected A.M. as we can see we can access the data members in main class, derived class
// and through abjects also in main.

class Animal{

    protected int legs;
    protected void eat(){
        System.out.println("EATINGGGGG!!!!!");
    }
}

class Dog extends Animal{

    void fun(){
        int l = legs;
        eat();
    }
}


public class TestAccessModifiers {
    public static void main(String[] args) {

        Animal a = new Animal();
        int l = a.legs;
        a.eat();


    }
}

