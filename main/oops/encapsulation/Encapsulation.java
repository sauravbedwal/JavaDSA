package main.oops.encapsulation;



class Student{

    private int rollNo;
    private String name;
    private int age;


    //Constructor Student we created below which is a default constructor

    Student(){

        System.out.println("A new Student is Registered");
    }

    //Constructor Student we created below which is a parameter constructor

    Student(int rollNo, String name, int age){

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;

    }


    //public void setRollNo(int rollNo){
    //  this.rollNo = rollNo;
    // }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be Negative!!!");
        }
    }


    public int getRollNo(){
        return rollNo;
    }
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    public void printDetails(){


        System.out.println("Details are: ");
        System.out.println("Roll No.:" +  this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("age: " + this.age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student stud1 = new Student(101, "Ravinder", 24);   //so here we gave the roll no and
        // we dont want to change it in future so we will simply remove the setRollNo method
        stud1.printDetails();

       // stud1.setRollNo(54); //it will not work reason mentioned in above line
        //stud1.printDetails();

        System.out.println(stud1.getRollNo()); //but here we can see the roll no so we can simply use it

        //stud1.setAge(-45); //if user input -ve age which is not possible so we can simply put condition in
        // set age method as now we using constructor.

        stud1.setAge(30);   //if we positive so itw ill change the age
        stud1.printDetails();
    }


}
