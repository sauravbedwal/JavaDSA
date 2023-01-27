package main.oops.inheritance;

class Area{

    private int length;
    private int breadth;

    Area(){  //formed default constructor
    }

    Area (int length, int breadth){  //formed constructor

        this.length = length;
        this.breadth = breadth;
    }

    public int calArea(){
        return length * breadth;
    }

}

class Volume extends Area {

    private int height;

    Volume (int length, int breadth, int height){

        super(length, breadth);   //super keyword always point to the parent class
        this.height = height;
    }

    public int calVolume(){

        return height * super.calArea();
    }
}



public class TestSuper {
    public static void main(String[] args) {

//        Area a = new Area(2, 3);
//        System.out.println(a.calArea());

        Volume v = new Volume(2, 3, 4);
        System.out.println(v.calVolume());

    }
}
