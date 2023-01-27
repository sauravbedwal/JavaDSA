package main.hashing;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {

        int a[] = new int[5];

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(57);
        myList.add(4);
        myList.add(45);

        int n = myList.size();

        Collections.sort(myList);

        Collections.sort(myList, Collections.reverseOrder());

        for (int i=0; i<n; i++){
            System.out.println(myList.get(i));
        }

    }
}
