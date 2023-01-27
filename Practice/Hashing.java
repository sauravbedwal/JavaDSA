package Practice;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {

        /*HashMap<Character, String> myMap = new HashMap<>();


        myMap.put('R', "Ravi");
        myMap.put('S', "Sam");
        myMap.put('A', "Avi");

        //System.out.println(myMap.get('R'));

        for (Map.Entry<Character, String> entry : myMap.entrySet()){
           System.out.println(entry.getKey() + "  " + entry.getValue());

        }

         */

        /*int a[] = {4, 5, 8, 6, 7};

        for (int x : a){
            System.out.print(x + " ");
        }

         */

        int a[] = {1, 7, 10, 1, 7, 7, 9};
        int n = a.length;

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int i=0; i<n; i++){
            int num = a[i];

            if (myMap.containsKey(num) == false){

                myMap.put(num, 1);
            }
            else {
                int count = myMap.get(num);
                myMap.put(num, count+1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        }
    }

