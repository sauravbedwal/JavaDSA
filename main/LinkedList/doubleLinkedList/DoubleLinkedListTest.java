package main.LinkedList.doubleLinkedList;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data =  data;
    }
}

class DoubleLinkedList{
    private Node head;
    private Node tail;

    boolean isEmpty(){
        return head == null && tail == null;
    }

    void pushLast(int data){
        Node newNode = new Node(data);

        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    void pushBegin(int data){
        Node newNode = new Node(data);

        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;        //these two statements can swap the position (line 43 & 44)
            head.prev = newNode;
            head = newNode;
        }

    }

    int popLast(){
        //List is Empty
        if (isEmpty()){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //Single Element
        if(head == tail && head != null){
            int delValue = tail.data;  //we can also use head.data as there is single element so both will point to data
            head = null;
            tail = null;
            return delValue;
        }

        int delValue = tail.data;

        tail = tail.prev;
        tail.next = null;
        return delValue;
    }


    int popBegin(){
        //List is Empty
        if (isEmpty()){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //Single Element
        if (head == tail && head != null){
            int delValue = tail.data;
            head = null;
            tail = null;
            return delValue;
        }

        int delValue = head.data;
        head = head.next;
        head.prev = null;
        return delValue;
    }

    void reverse() {
        //by ravinder sir method

        if (head == null && tail == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node pre = head;
        Node cur = pre.next;
        Node pos = null;
        if (cur != null)
            pos = cur.next;

        while (cur != null) {
            cur.next = pre;
            cur.prev = pos;
            pre = cur;
            cur = pos;
            if (pos != null)
                pos = pos.next;
        }
        head.next = null;
        tail.prev = null;
        tail = head;
        head = pre;
    }

     /*void reverse() {
//by jenny's lecture youtube had osm understanding but ravinderSir one is best coz its logic similar for singly & doubly
        //here we took two variables and from starting we doing head/prev = null and going forward unlike above method

        Node cur;
        Node nextNode;

        cur = head;

            while (cur != null){
            nextNode = cur.next;
            cur.next = cur.prev;
            cur.prev = nextNode;
            cur = nextNode;
        }

        cur = head;
        head = tail;
        tail = cur;

    }*/

    void pushPos(int data, int pos){
        int size = getSize();
        if (pos > size+1){
            System.out.println("Error: List has only " + size + "elements!!");
            return;
        }

        //list has only 1
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
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
        temp.next.next.prev = temp;
        return delVal;
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

        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class DoubleLinkedListTest {
    public static void main(String[] args) {

        DoubleLinkedList myList = new DoubleLinkedList();

        myList.pushLast(10);
        myList.pushLast(20);     //for single element we can comment the statements.
        myList.pushLast(30);
        myList.pushLast(40);
        myList.pushLast(50);
        myList.pushLast(60);
        myList.print();

//        myList.popBegin();        //when we just simply call method and print it then it does remove the element as
//        myList.popLast();        //per the method but dont return the delValue but when we use same method using sout
                                  //then it does the function and return the delValue also

//        System.out.println(myList.popBegin());
//        System.out.println(myList.popLast());
//        myList.print();

        myList.reverse();
        myList.print();

        myList.pushPos(100, 3);
        myList.print();

        myList.popPos(3);
        myList.print();
    }
}





