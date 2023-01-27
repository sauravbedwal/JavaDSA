package main.oops.polymorphism;


//
class Area{

    //Constructor Overloading

    Area(){}
    Area(int x){}
    Area(float x){}
    Area(int x, int y){}


    //Method Overloading

    //Square
    int calArea(int side){
        return side * side;
    }

    //Rectangle
    int calArea(int length, int breadth){
        return length * breadth;
    }

    //Circle
    float calArea(float radius){
        return (float)(Math.PI * radius * radius);
    }
}


public class StaticPolymorphism {
    public static void main(String[] args) {

        Area a = new Area();
        System.out.println(a.calArea(4, 6)); //while calling calArea compiler differentiate among calArea
        // at the compile time


    }
}
