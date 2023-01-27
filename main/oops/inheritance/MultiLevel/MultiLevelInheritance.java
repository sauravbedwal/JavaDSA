package main.oops.inheritance.MultiLevel;

class Animal {

    int legs;
    void eat() {
        System.out.println("EATINGGGGGGGGGGGG!!!");
    }
}

class Dog extends Animal {

    int tail;

    void bark(){
        System.out.println("BARKINGGGGG!!!");
    }
}

class Puppy extends Dog{

    void sleep(){
        System.out.println("SLEEPINGGGGG!!!");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        //here we can see puppy can sleep method, bark method as Dog is base class but also eat method bcoz Puppy
        // derived from Dog class and Dog derived from Animal class.

        p.sleep();
        p.eat();
        p.bark();

        //here we can see Dog cant take sleep method bcoz sleep method is by Puppy class which is a dervied class of Dog
        // as features can be copied from base to derived class


//        Dog d = new Dog();
//        d.sleep();
//        d.eat();
//        d.bark();

    }
}
