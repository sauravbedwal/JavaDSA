package main.oops.inheritance.SingleLevel;


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


public class SingleLevelInheritance {
    public static void main(String[] args) {

//        Animal a = new Animal();   //by this we calling class Animal
//        a.eat();

        Dog d = new Dog();   //by this we calling class Dog
         d.tail = 1;
        d.bark();

        d.legs = 4;  //and as Dog is a derived class by Animal so we can use features of Animal also
        d.eat();


    }
}
