package main.LinkedList.singleLinkedList;

//all methods except reverse method
import java.awt.*;

class Node{     //data can be heterogenous means collection of many things. (int rollNo; String name; int age;)

    int data;
    Node next;

    Node(int data){         //constructor formed (Node) in which we can directly pass the data and below in push method
        this.data = data;  // we can use it and also in push method it shows error when (Node newNode = new Node();) is
    }                     //like this bcoz we created Parameterized Constructor and below its default (new Node();) and
}                        //we can also create a default Constructor for Node but as there will be no such use case where
                        //we created a newNode but didn't put any data in it that why we didn't created a default
                       //constructor for Node.



class LinkedList{
//    Node head;                    //comments off to understand pop method i.e. head.next.next otherwise its good to
                                   //    mark it as private cpz we dont want user change the head.
    private Node head;             //as we dont want user access head that why we private head (detail reason in main)

    void pushLast(int data){
//        Node newNode = new Node();   //showing error reason mentioned above Node Constructor
//        newNode.data = data;

        Node newNode = new Node(data);      //Constructor Node formed and used here.

        if (head == null){
//            Node newNode = new Node();
//            newNode.data = data;        //here we can see these 2 statements r common in if part and in else part
                                         //also bcoz whether LL have single element(empty) or already have some
            head = newNode;             //elements in the list we have to create newNode in both cases bcz we need
                                       //space for the new element in the form of Node so in if and else we can skip the
        }                             //part and declare it before ifElse.
        else{
//            Node newNode = new Node();    //same above mentioned
//            newNode.data = data;

            Node temp = head;
            //go to last node
            while (temp.next != null){
                temp = temp.next;
            }
            //connect last node to newNode
            temp.next = newNode;
        }
    }

//    void popLast(){                         //can use when just need to remove last node and dont want to return anything
//
//        Node temp = head;
//        while (temp.next.next != null){
//
//            temp = temp.next;
//        }
//
//        temp.next = null;
//    }




    int popLast(){                                //can use when we want to remove last node and also want to return the
                                              // deleted value thats why used int here as int pop method

        //List is empty
        if (head == null){                    //this if condition is when in main user does myList.pop method but there
                                              // is no data as List is empty and it will show error (exception) and
            System.out.println("Error : List is Empty!!");    // program will crash but by if condition it wont crash
            return -1;
        }

        //List contains single element
        if (head.next == null){            //this if condition is when in main we have only 1 data and we want to delete
                                          //that so without this if cond. it show error bcoz (temp.next.next) condition
            int delValue = head.data;    //is not possible bcoz temp.next + null and after that there is no data to get
            head = null;                // temp.next.next
            return delValue;
        }

        //Rest of the cases
        Node temp = head;
        while (temp.next.next != null){

            temp = temp.next;
        }
        int delValue = temp.next.data;
        temp.next = null;
        return delValue;
    }



    void pushBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }



    int popBegin(){
        //List is empty
        if (head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        int delValue = head.data;
        head = head.next;
        return delValue;
    }


    void pushPos(int data, int pos){

        int size = getSize();
        if (pos > size+1){
            System.out.println("Error : List has only " + size + "elements!!");
            return;
        }

        Node newNode = new Node(data);
        //List is Empty
        if (head == null){

            head = newNode;
            return;
        }
        //Reach Pos 1 node behind the required pos
        Node temp = head;
        for (int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



    int popPos(int pos){
        int size = getSize();
        if (pos > size){
            System.out.println("Error : List has only " + size + "elements!!");
            return -1;
        }

        //List contains single element
        if (head.next == null){
            int delValue = head.data;
            head = null;
            return delValue;
        }
        //pos is 1
        if (pos ==1){
            int delValue = head.data;
            head = head.next;
            return delValue;
        }

        //Reach Pos 1 node behind the required pos
        Node temp = head;
        for (int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        int delValue = temp.next.data;
        temp.next = temp.next.next;
        return delValue;



    }

    boolean isEmpty(){                //if want to check whether list is empty or not
//        if (head == null)          // we can use either if condition or directly return the condition as its boolean
//            return true;          //it will automatically show true false
//        else
//            return false;

        return head == null;
    }

    int getSize(){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}




public class SingleLinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
//        System.out.println(myList.isEmpty());    //if we use isEmpty method without any data it shows true

//        myList.pushLast(10);           //if list is empty and user using pop method (delete) then do comments and when
//        myList.pushLast(20);          //user wants to use pushLast method then remove Comments
//        myList.pushLast(30);
//        myList.pushLast(40);
//
//        myList.print();          //for push we can use this print

//        myList.head = null;   //here we were getting the option of head also ut we dont want that user get that option
                               //in main bcoz if user get that option he can manipulate the list and change the head and
                              //can also make it null so that's why we private the head in class LinkedList


//        System.out.println(myList.head.data);           //to make us understand pop method if we do head.next we can go
//        System.out.println(myList.head.next.data);     //to next node and by head.next.next it will be second last
//        System.out.println(myList.head.next.next.data);  //(letting 4 node r there)

//        myList.popLast();                                //can use when just need to remove last node for void pop method
//        myList.print();

//        System.out.println(myList.popLast());      //when user wants to use popLast method then remove Comments
                                                  // can use when we want to remove last node and also want to return
                                                 //the deleted value for int pop method and with or without if condition

//        myList.pushLast(100);                 //when user wants to use pushLast method then remove Comments
//        myList.print();

//        System.out.println(myList.isEmpty());    //if we use isEmpty method with all the data present it shows false

//        System.out.println(myList.popLast());     //when user wants to use popLast method then remove Comments
//        System.out.println(myList.popLast());    //pop out all data and then print true
//        System.out.println(myList.popLast());
//        System.out.println(myList.popLast());

//        System.out.println(myList.isEmpty());     //when user wants to use isEmpty method then remove Comments

//        myList.pushBegin(10);              //when user wants to use pushBegin method
//        myList.pushBegin(20);             //as its pushBegin here first added 10 then 20 then 30
//        myList.pushBegin(30);            //when there is no data means for if condition in popBegin method do comments
//        myList.print();

//        System.out.println(myList.popBegin());     //when user wants to use popBegin method
//        myList.print();

//        myList.pushBegin(10);                    //when user wants to use all methods together like first push data at
//        myList.pushBegin(20);                    //beginning then at last then pop data from first and last and print
//        myList.pushBegin(30);
//        myList.pushLast(40);
//        myList.pushLast(50);
//        myList.pushLast(60);
//
//        myList.print();
//
//        myList.popBegin();
//        myList.popLast();
//
//        myList.print();

    //        myList.pushLast(10);                 //when user wants to use pushPos method to insert data in between the
    //        myList.pushLast(20);                //node at a particular position (kth position)
    //        myList.pushLast(30);
    //        myList.pushLast(40);
    //        myList.pushLast(50);
//              myList.print();

    //        myList.pushPos(500, 3);              //when user wants to use pushPos method to insert data in between the
    //        myList.print();                         //node at a particular position (kth position and when user wants to
                                                // insert the data in empty List


//        myList.pushPos(500, 3);        //when user wants to insert data at the let say 3 position but in list
//                                                //only 1 node is there so by this we get the no. of node's (List)
//        System.out.println(myList.getSize());
//        myList.print();


        myList.pushLast(10);                 //when user wants to insert data at the position which is greater than
//        myList.pushLast(20);                //size of data
//        myList.pushLast(30);
//        myList.pushLast(40);
//        myList.pushLast(50);
        myList.print();



//        myList.pushPos(500, 10);                  //when user wants to insert at 10 position in pushPos method
//        myList.pushPos(300, 6);                  //insert at 6 position as list has size 5 and it will work
//
//        System.out.println(myList.getSize());
//        myList.print();

//        System.out.println(myList.popPos(3));   //when we have all list like here al 5 nodes
//        System.out.println(myList.popPos(2));   //for 2 nodes so for that refer pos is 1 in popPos method (like 1, 2)
        System.out.println(myList.popPos(2));       //when we have only 1 node we can use that for 1 and for any other
        myList.print();                               //position also more than 1 (like 2,3 etc)



    }
}














//same code but by sir wth no comments  //14  NOv having few methods

/*package main.linkedList.singlyLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    private Node head;

    void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            //goto Last node
            while(temp.next != null){
                temp = temp.next;
            }

            //connect last node to newNode
            temp.next = newNode;
        }
    }

    int pop(){

        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //List contains single element
        if(head.next == null){
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Rest of the cases
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        int delValue = temp.next.data;
        temp.next = null;
        return  delValue;
    }

    boolean isEmpty(){
//        if(head == null)
//            return true;
//        else
//            return false;
        return head == null;
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        System.out.println(myList.isEmpty());
        myList.push(10);
        myList.push(20);
        myList.push(30);
        myList.push(40);
        myList.print();

        System.out.println(myList.pop());
        myList.push(100);
        myList.print();
        System.out.println(myList.pop());
        System.out.println(myList.pop());
        System.out.println(myList.pop());
        System.out.println(myList.pop());
        System.out.println(myList.pop());

        System.out.println(myList.isEmpty());
    }
}

 */



// Reverse Single LL 15 Nov //with all methods  + reverse method also


/*package main.linkedList.singlyLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    private Node head;

    void pushLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            //goto Last node
            while(temp.next != null){
                temp = temp.next;
            }

            //connect last node to newNode
            temp.next = newNode;
        }
    }
    int popLast(){

        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //List contains single element
        if(head.next == null){
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Rest of the cases
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        int delValue = temp.next.data;
        temp.next = null;
        return  delValue;
    }

    void pushBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    int popBegin(){
        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        int delValue = head.data;
        head = head.next;
        return delValue;
    }

    void pushPos(int data, int pos){
        int size = getSize();
        if(pos > size+1){
            System.out.println("Error: List has only " + size + "elements!!");
            return;
        }

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        //Reach pos 1 node behind the required pos
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    int popPos(int pos){
        int size = getSize();
        if(pos > size){
            System.out.println("Error: List has only " + size + " elements!!");
            return -1;
        }

        //List contains single element
        if(head.next == null){
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Pos is 1
        if(pos == 1){
            int delValue = head.data;
            head = head.next;
            return delValue;
        }

        //Reach pos 1 node behind the required pos
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }

        int delVal = temp.next.data;
        temp.next = temp.next.next;
        return delVal;
    }

    void reverse(){
    if(head == null){
    System.out.println("Error : List is Empty!!");
    return;
    }
        Node pre = head;
        Node cur = pre.next;
        Node pos = null;
        if(cur!=null)
            pos = cur.next;

        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = pos;
            if(pos!=null)
                pos = pos.next;
        }

        head.next = null;
        head = pre;
    }

    boolean isEmpty(){
//        if(head == null)
//            return true;
//        else
//            return false;
        return head == null;
    }
    int getSize(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(30);
        myList.pushLast(40);
        myList.pushLast(50);

        myList.print();
        myList.reverse();
        myList.print();

    }
}

 */

