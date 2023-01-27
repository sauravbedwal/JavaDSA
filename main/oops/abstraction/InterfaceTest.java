package main.oops.abstraction;

import javax.sound.midi.Soundbank;

interface Animal{   //all the methods in interface are abstract it is just to create the template as non abstract method
                    // cant create inside interface and all the methods r public (if we dont write anything then its
                  // by default public.

    String msg = "ANIMAL CLASS";   //msg not depend on objects so by default all the properties inside interface r final

    void eat();
    void sleep();
    void walk();
}

class Dog implements Animal{

    public void eat(){                     //we need to use her public bcoz in Animal class all methods r public so here
                                          // method can shift from private to public but not from public to private.
        System.out.println("Eating!!!");
    }

    public void sleep(){
        System.out.println("Sleeping!!!");
    }

    public void walk(){
        System.out.println("Walking!!!");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {

        Animal a = new Animal() {
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }

            @Override
            public void walk() {

            }
        };

        //a.msg = "Ravi";   //shows error as it says cannot assign the values to a final variable
        System.out.println(a.msg);

    }

}
