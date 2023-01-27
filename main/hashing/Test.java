package main.hashing;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        //in this code we learning abt how to put keys and values and how to get output(input and output).
        // access time => O(1)
        //


        /*HashMap<Character, String> myMap = new HashMap<>();

        myMap.put('R' , "Ravi");
        myMap.put('K' , "Krishna");
                myMap.put('V' , "Virendra");
                myMap.put('F' , "Fahim");



        System.out.println(myMap.get('V'));
        myMap.put('V' , "Veena");  //if we already have a define key like 'V' and we put new value to it then it will
        //overwrite(change the previous value with new value) & if Key not defined then it will define the key & value.

        System.out.println(myMap.get('V'));


         //above code will be mute from sout till sout 'V'
        //in this code we take output by enhance for loop

        for(Map.Entry<Character, String> entry: myMap.entrySet()){   //after String instead of entry: we can write
                                                                     // or named it anything like x.

            System.out.println(entry.getKey() + "==>" + entry.getValue());



        }*/



        //in this code we r learning abt map interface : Hash Map, Linked Map and Tree map and use all three maps
        // Hash map print randomly, Linked map print same as insertion and Tree map print in sorted order based on keys.


        //HashMap<Integer, String> myMap = new HashMap<>();   //all three maps
        //LinkedHashMap<Integer, String> myMap = new LinkedHashMap<>();
        TreeMap<Integer, String> myMap = new TreeMap<>();

        myMap.put( 4 , "Ravi");
        myMap.put( 7 , "Krishna");
        myMap.put( 34 , "Virendra");
        myMap.put( 12 , "Fahim");



         for(Map.Entry<Integer, String> entry: myMap.entrySet()){   //after String instead of entry: we can write
            // or named it anything like x.

            System.out.println(entry.getKey() + "==>" + entry.getValue());

        }

         //in this code we just checking that key is present or not by direct sout if present it will print
        // TRUE else FALSE

        System.out.println(myMap.containsKey(34));
        System.out.println(myMap.containsKey(56));


        //in this code we just checking that value is present or not by direct sout if present it will print
        // TRUE else FALSE
        System.out.println(myMap.containsValue("Ravi"));
        System.out.println(myMap.containsValue("adam"));

    }
}
