package main.oops.inheritance.Hierarichical;

class Animal {

    int legs;
    void eat() {

        System.out.println("EATINGGGGGGGGGGGG!!!");
    }
}

class Dog extends Animal {

    void bark(){

        System.out.println("BARKINGGGGG!!!");
    }
}

class Cat extends Animal{

    void meow(){

        System.out.println("MEOWWWWWWWW!!!");
    }
}


public class Hierarichical {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.bark();
        d.eat();

        Cat c = new Cat();

        c.meow();
        c.eat();

    }
}
