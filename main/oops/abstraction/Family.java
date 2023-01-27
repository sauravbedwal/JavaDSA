package main.oops.abstraction;


//in this code we learning abt interface class which is part of Abstraction.

class Grandfather{
    void play(){
        System.out.println("Playyyyyy!!");
    }
}

interface GrandMother{
    void sing();
}

interface Mom extends GrandMother{
    void paint();
    void eat();
}


//interface Mom{         //comments turn off when we comment down above interface Grandmother as that was added to ex.
//    void paint();
//    void eat();
//}

interface Dad{
    void drive();
    void eat();
}

class Child extends Grandfather implements Mom, Dad{    //we can also use one class extends

    public void paint() {}
    public void drive() {}
    public void eat() {}
    public void sing() {}   //above we created grandmother interface and extends mom to it and if we dont add here sing
                           // method it shows error bcoz its mandatory to define in class
}

public class Family {
    public static void main(String[] args) {

    }
}
