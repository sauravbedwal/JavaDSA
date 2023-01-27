package main.oops.keywordsAndAccessModifiers;

//in this code we making class named Student, inside there is data members/methods (roll no, name, age) and then
// in main we created objects (stud1, stud2 etc)

/*class Student{

    int rollNo;
    String name;
    int age;

}

public class Test {
    public static void main(String[] args) {

        Student stud1 = new Student();

        stud1.rollNo = 23;
        stud1.name = "Ravi";
        stud1.age = 24;

        System.out.println(stud1.rollNo);
        System.out.println(stud1.name);
        System.out.println(stud1.age);

        Student stud2 = new Student();
        stud2.rollNo = 10;
        stud2.name = "Ram";
        stud2.age = 25;

        System.out.println(stud2.rollNo);
        System.out.println(stud2.name);
        System.out.println(stud2.age);


    }
}*/


//in this code we making class named Student, inside there is data members/methods (roll no, name, age) and then
// in main we created objects (stud1, stud2 etc) but previously we  printing them in main by sout for each case so
// now we just created a method(function) inside the class named as printDetails in which we sout and
// in main just called the function

/*class Student{

    int rollNo;
    String name;
    int age;

    void printDetails(){

        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(age);
    }


}

public class Test {
    public static void main(String[] args) {

        Student stud1 = new Student();

        stud1.rollNo = 23;
        stud1.name = "Ravi";
        stud1.age = 24;

        stud1.printDetails();

        Student stud2 = new Student();
        stud2.rollNo = 10;
        stud2.name = "Ram";
        stud2.age = 25;

        stud2.printDetails();

        //here we comparing the upper code with string that we used to do it earlier

        String str = new String();   //String is the class same as Student
        str = "Ravinder";           //str is same as (rollNo, names, age) which are data members

        str.length();              //str.length() is a method/function



        // here we took an array and here we can see int is not a class as class will always start with a capital Letter
        //int is primitive datatype but Integer is a class which have alot of properties like Integer.MAX_VALUE,
        // Integer.min()


        int a[] = {1, 2, 3, 4};
        int n = a.length;

        //Integer.min();


        // here we are changing the stud1 name and then printing and to run the below code we have to comment down
        // Integer.min(); (96 line) thats how we change the values

        stud1.name = "Ravinder";
        stud1.printDetails();

    }
}

 */


// here we are taking more than one method inside the class Student and also taking roll no by user
//and also if we want jsut name then instead of sout(stud1.name) we created a function

/*class Student{

    int rollNo;
    String name;
    int age;

    void printDetails(){

        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(age);
    }

    void message(){ //we can also call more than one method inside the class Student

        System.out.println("Hello Everyone");
    }

    void setRollNo(int r){

        rollNo = r;
    }

    String getName(){  //here we created this function for printing name.
        return name;
    }


}

public class Test {
    public static void main(String[] args) {

        Student stud1 = new Student();

        stud1.setRollNo(5); // here we input the rollNo and setRollNo function will be called
        stud1.name = "Ravi";
        stud1.age = 24;

        stud1.printDetails();

        stud1.message();

        //System.out.println(stud1.name);
        System.out.println(stud1.getName());



    }
}

 */

//here in this code we r taking input by user

/*import java.util.Scanner;

class Student{

    int rollNo;
    String name;
    int age;

    void printDetails(){

        System.out.println("Details are: ");
        System.out.println("Roll No.:" +  rollNo);
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }

    void message(){ //we can also call more than one method inside the class Student

        System.out.println("Hello Everyone");
    }

    void setRollNo(int r){

        rollNo = r;
    }
}



public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rollNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();

        Student stud1 = new Student();

        stud1.setRollNo(rollNo); // here we input the rollNo and setRollNo function will be called
        stud1.name = name;
        stud1.age = age;

        stud1.message();
        stud1.printDetails();


    }
}

 */


// in this code we learnt Access Modifiers (private and public) and abt keywords also i.e. this.


/*import java.util.Scanner;

class Student{

    private int rollNo;
    public String name;
    public int age;


    private void message(){ //we can also call more than one method inside the class Student

        System.out.println("Hello Everyone");
    }

//    public void setRollNo(int r){    //setRollNo is for taking value from user as we r setting it.
//
//        rollNo = r;
//    }



    //here setRollNo was (int r) but as we changed the name to rollNo it is not taking the int rollNo bcoz inside
    // setRollNo name is same and that pointing to (int rollNo) i.e. and we want to change the int rollNo
    //  BUT if we use this. keyword here then whatever we will point as this that will point to int rollNo in class

    public void setRollNo(int rollNo){

        this.rollNo = rollNo;  //as here uh can see after using this. keyword purple rollNo point the int rollNo
        // in which the value got assigned and white rollNo is same which is the input by user in setRollNo(int rollNo)
    }

    public int getRollNo() {  //getRollNo is we have the value already we don't want to take it by user we just want to
                             // print as user will not  pass anything bcoz he wants the no as he don't want to set it
        return rollNo;
    }

    public String getName(){  //here we created this function for printing name.
        return name;
    }


    public void printDetails(){

//        System.out.println("Details are: ");
//        System.out.println("Roll No.:" +  rollNo);
//        System.out.println("Name: " + name);
//        System.out.println("age: " + age);


        //here we can use this.rollNo, name and age also as there are can be many objects like stud1, stud2, stud3 so on
        //so here this. will be mean as stud1 and will print info of stud1

        System.out.println("Details are: ");
        System.out.println("Roll No.:" +  this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("age: " + this.age);
    }
}



public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rollNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();

        Student stud1 = new Student();

        //stud1.rollNo = 23;  // here we can see its showing error bcoz we did private int roll and rest data members and
//methods r public but same rollNo.can work above in class Student as it can be used inside its own class only

        stud1.setRollNo(rollNo); //using (rollNo) coz we taking input by the user above ((rollNo) and (23)) both r same
        //stud1.setRollNo(23);  //here if we private any value then we will assign it like this as here rollNo is private
//but there is a method called setRollNo in same class but that method is not private so here we used that method
// and assign the value
        stud1.name = name;
        stud1.age = age;

        stud1.message(); //here also we can see error bcoz of same thing coz we private message method.
        stud1.printDetails();

        System.out.println(stud1.getRollNo()); //just to print the rollNo we can simply create method called getRollNo


    }
}

 */


//




/*class Student{

    private int rollNo;
    public String name;
    public int age;


    //Constructor Student we created below which is a default constructor

    Student(){

        System.out.println("A new Student is Registered");

        rollNo = -1;  //we can also assign the default value when no input given by user.
        name = "ABC";
        age = -1;
    }

    //Constructor Student we created below which is a parameter constructor
    Student(int rollNo, String name, int age){

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;

    }


    private void message(){ //we can also call more than one method inside the class Student

        System.out.println("Hello Everyone");
    }

//    public void setRollNo(int r){    //setRollNo is for taking value from user as we r setting it.
//
//        rollNo = r;
//    }



    //here setRollNo was (int r) but as we changed the name to rollNo it is not taking the int rollNo bcoz inside
    // setRollNo name is same and that pointing to (int rollNo) i.e. and we want to change the int rollNo
    //  BUT if we use this. keyword here then whatever we will point as this that will point to int rollNo in class
    public void setRollNo(int rollNo){

        this.rollNo = rollNo;  //as here uh can see after using this. keyword purple rollNo point the int rollNo
        // in which the value got assigned and white rollNo is same which is the input by user in setRollNo(int rollNo)
    }

    public int getRollNo() {  //getRollNo is we have the value already we don't want to take it by user we just want to
        // print as user will not  pass anything bcoz he wants the no as he don't want to set it
        return rollNo;
    }

    public String getName(){  //here we created this function for printing name.
        return name;
    }


    public void printDetails(){

//        System.out.println("Details are: ");
//        System.out.println("Roll No.:" +  rollNo);
//        System.out.println("Name: " + name);
//        System.out.println("age: " + age);


        //here we can use this.rollNo, name and age also as there are can be many objects like stud1, stud2, stud3 so on
        //so here this. will be mean as stud1 and will print info of stud1

        System.out.println("Details are: ");
        System.out.println("Roll No.:" +  this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("age: " + this.age);
    }
}



public class Test {
    public static void main(String[] args) {

        //Student stud1 = new Student();   //used for default constructor
        Student stud1 = new Student(23, "Ravi", 28); //used for parameter constructor

        Student stud2 = new Student();  //if we using parameterized constructor but then we create new object
        // without parameter then we need to create a default constructor

        //Student stud2 = new Student();  //if we create 2 objects then it will show 2 times the Constructor sout.

        stud1.printDetails();   // here we called printDetails method but have not put any input so it showing some
        // default values



//        stud1.setRollNo(23);    //comment down them to understand constructor in above line.
//        stud1.name = "Ravinder";
//        stud1.age = 28;

// here above we created a memory for Student and the assign the values which is same as we did below for int x and
// string  str.

//        int x;
//        x = 10;
        int x = 10;  //we can do like this also above 2 lines

//        String str = new String();
//        str = "HELLO";

        String str = new String("HELLO"); //we can do like this also above 2 lines



    }
}

 */


//static keyword 11 nov abstraction class


/*class Student {

    private int rollNo;
    private String name;
    private int age;


    //Constructor Student we created below which is a default constructor

    static int count = 0;   //as by static keyword memory of count is same for all thats why whatever we sout it will
    //show count of 5

    Student() {

        System.out.println("A new Student is Registered");
        count ++;
    }

    //Constructor Student we created below which is a parameter constructor

    Student(int rollNo, String name, int age) {

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;

    }

    static void message(){
        //System.out.println("Welcome to Discovery Batch");

        System.out.println("Welcome to Discovery Batch of " + count + " students");
    }


    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
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



public class Test {

//    void fun(){}

    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();
        Student stud4 = new Student();
        Student stud5 = new Student();

        //System.out.println(stud3.count);

        Student.message();

        //fun();   //here it is showing error bcoz static variables can call only other static methods
                  //and also in static we dont need to create the object and we can see in class Test we didnt create
        // the Object of Test as our main is Static
    }

}

 */



//final keyword in the code


class Vehicle{
    void brakes(){
        System.out.println("Breaks Applied");
    }
}

class Bike extends Vehicle {

   final void brakes(){ System.out.println("Disc Brakes!!!"); }  //here we used final keyword for brakes bcoz
    // we don't want it to be changed and bcoz of that its showing error below in Pulsar class
}

final class Pulsar extends Bike { //here we used final keyword for class Pulsar bcoz we don't want it to be inherited and
                                 // bcoz of that its showing error below in Pulsar2 class

//    void brakes() { System.out.println("Hydraulic Brakes"); }  //showing error reason mentioned above in Bike class as
                                                                 //for method it cannot be overridden
}

//class Pulsar2 extends Pulsar {        //showing error reason mentioned above in Pulsar class as Pulsar class is final so
//                                     // it cannot br inherited
//
//}

class Aeroplane extends Vehicle {

    void brakes(){
        System.out.println("Hydraulic Brakes");
    }
}

/*public*/ class FinalKeyword {                 //need to check why i have written public here in Final class
    public static void main(String[] args) {


        // final Keyword

        final int x;   //finalised thing which cannot be changed

        x = 10;  //we can initialise it once means gave the value

//        x++;    //here it is showing error
//        x = 12;  //here it is showing error


    }
}
