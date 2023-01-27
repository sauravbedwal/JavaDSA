package main.LinkedList.circularLinkedList;

//Circular Linked List for Single Linked List with methods

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}


class CircularLinkedList{
    private Node head;

    void pushLast(int data){
        Node newNode = new Node(data);
       //List is Empty
        if (isEmpty()){
            head = newNode;
            head.next = head;         //we can also write newNode instead of head
        }
        else {
            Node temp = head;
            while (temp.next != head){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }


    void pushBegin(int data){
        Node newNode = new Node(data);
        //List is empty
        if (isEmpty()){
            head = newNode;
            head.next = head;         //we can also write newNode instead of head
        }
        else{
            Node temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }

    }

    int popLast(){

        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //List contains single element
        if(head.next == head){                   //same as popLast of Single LL just instead null we wrote head here
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Rest of the cases
        Node temp = head;
        while (temp.next.next != head){          //same as popLast of Single LL just instead null we wrote head here
            temp = temp.next;
        }

        int delValue = temp.next.data;
        temp.next = head;                      //same as popLast of Single LL just instead null we wrote head here
        return  delValue;
    }


    int popBegin(){                                 //in this method first we changed head and then simply it became as
        //List is empty                            // popLast method so we called that method
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        int delValue = head.data;
        head = head.next;
        popLast();
        return delValue;
    }

    void pushPos(int data, int pos){
        int size = getSize();
        if (pos > size+1){
            System.out.println("Error: List has only " + size + " elements!!");
            return;
        }

        //List has only 1
        Node newNode = new Node(data);
        if (head.next == head){
            head.next = newNode;
            newNode.next = head;
            return;
        }
        //Reach pos 1 node behind the required pos
        Node temp = head;
        for (int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    int popPos(int pos) {
        int size = getSize();
        if (pos > size) {
            System.out.println("Error: List has only " + size + " elements!!");
            return -1;
        }
        //List contains single element and uh deleting that element
        if (head.next == head) {
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Pos is 1  so uh deleting 1 pos node and shifting the head to the second node
        if (pos == 1) {
            Node temp = head;
            while (temp.next != head) {   //we can also write while (temp.next.next != head) but then below line 140
              temp = temp.next;           //write the same
            }
            int delValue = head.data;
            head = head.next;
            temp.next = head;           //temp.next.next = head;  (info mentioned above line 135)
            return delValue;
        }

        //Reach pos 1 node behind the required pos
        Node temp = head;
        for (int i=1; i<pos-1; i++) {
            temp = temp.next;
        }
        int delValue = temp.next.data;
        temp.next = temp.next.next;
        return delValue;
    }

    void reverse(){
        if (head == null){
            System.out.println("List is Empty!");
            return;
        }

        Node pre = head;
        Node cur = pre.next;
        Node pos = null;
        if (cur!=null) // can use head also
        pos = cur.next;

        while(cur!=head){
            cur.next = pre;
            pre = cur;
            cur = pos;
            if (pos!=null)  //can use head
                pos = pos.next;
        }
        cur.next = pre;
        head = pre;
    }


    boolean isEmpty(){
        return head == null;
    }

    int getSize(){
        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        }while(temp != head);
        return count;
    }


    void print() {
        if(isEmpty()){
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}


public class CircularLinkedListTest {
    public static void main(String[] args) {

        CircularLinkedList myList = new CircularLinkedList();
        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(30);
        myList.pushBegin(50);
        myList.pushBegin(60);
        myList.print();


   /*     myList.popLast();
        myList.popBegin();
        myList.print();*/

        System.out.println(myList.getSize());

        myList.pushPos(100,2);
        myList.print();
        System.out.println(myList.popPos(1));
        myList.print();

        myList.reverse();
        myList.print();
    }
}






//Circular Linked List for Single Linked List printing all the Nodes
//(when user want to print all nodes in singly LL in circular LL without class CircularLinkedList mentioned above)


/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}


public class CircularLinkedListTest {
    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        Node head =  node1;

        Node temp = head;
        do{                                             //cant use while(t!=null) loop coz in that it will print
            System.out.print(temp.data + " --> ");     //infinitely bcoZ its circularly connected and there is no null
            temp = temp.next;                         //and if we do head instead of null in while loop then it won't
        }while (temp != head);                       //print anything as it will break in the start only so doWhile loop

    }
}

 */

