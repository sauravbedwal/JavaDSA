package main.LinkedList;

class Node{

    int data;     //node storing data and next and in next we store address of other node thats why we took next as Node
    Node next;
}
public class Test {
    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();



        node1.data = 10;    //we created 4 nodes and connected them manually.
        node1.next = node2;
        node2.data = 20;
        node2.next = node3;
        node3.data = 30;
        node3.next = node4;
        node4.data = 40;
        node4.next = null;

//        System.out.println(node2.data);   //print node2 data

        Node head = node1;

        Node temp = head;
        while(temp != null){

            System.out.print(temp.data + " -->");
            temp = temp.next;
        }

        System.out.print(temp);   //it printed null also


    }
}
