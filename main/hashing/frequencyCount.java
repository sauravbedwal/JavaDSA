package main.hashing;

import java.util.HashMap;
import java.util.Map;

public class frequencyCount {
    public static void main(String[] args) {

        int a[] = {1, 7, 10 ,1, 7, 7, 9};
        int n = a.length;

        HashMap<Integer, Integer> myMap = new HashMap<>();


        for(int i=0; i<n; i++){
            int num = a[i];

            if(myMap.containsKey(num) == false){

                myMap.put(num,1);
            }
            else {
                int count = myMap.get(num);   // when we do myMap.getKey() then we get all the keys &
                // when we do myMap.getValue() then we get all the Values but on myMap.get(num) & num here is key
                //and num = a[i] so here we will get num value (count) i.e. 1 which is key's Value.
                myMap.put(num, count+1);
            }
        }
        for(Map.Entry<Integer, Integer>  entry : myMap.entrySet()){
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }
}
