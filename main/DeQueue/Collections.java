package main.DeQueue;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        //in these codes we learn abt List.

        /*//when we create LL it prints it.
//        LinkedList<Integer> myList  = new LinkedList();
//
//        myList.addFirst(10);
//        myList.addFirst(20);
//        myList.addFirst(30);
//
//        System.out.println(myList);
//
//        //in array when we try to print it fails and print the address of first node
//        int a[] = {10, 20, 30};
//        System.out.println(a);

        //in this it prints the array bcoz it has that iterable interface.
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println(myList);

        //instead using ArrayList or LinkedList we can simply use List and later define it as array, LL or vector

        List<Integer> myList = new LinkedList<>();
        List<Integer> myList = new ArrayList<>();
        List<Integer> myList = new Vector<>();

 */

        ArrayDeque<Integer> myDQ = new ArrayDeque<>();

        myDQ.addLast(10);
        myDQ.addLast(20);
        myDQ.addLast(30);

        myDQ.addFirst(50);
        myDQ.addFirst(60);
        myDQ.addFirst(70);

        System.out.println(myDQ);
        System.out.println(myDQ.removeFirst());
        System.out.println(myDQ.removeLast());

        System.out.println(myDQ);

        System.out.println(myDQ.peekFirst());
        System.out.println(myDQ.peekLast());

        System.out.println(myDQ);

//        myDQ.addFirst();
//        myDQ.addLast();
//        myDQ.removeFirst();
//        myDQ.removeLast(); // and lot more methods are there that we can use


    }
}
