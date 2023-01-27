package main.hashing;


//First non-repeating character in a String
//https://my.newtonschool.co/playground/code/d0l7ebxqdksz/

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "newtonschool";
        int n = str.length();

        LinkedHashMap<Character, Integer> myMap = new LinkedHashMap<>();

        for(int i=0; i<n; i++) {

            char alpha = str.charAt(i);
            if (myMap.containsKey(alpha) == false) {
                myMap.put(alpha, 1);
            } else {
                int count = myMap.get(alpha);
                myMap.put(alpha, count+1);

            }
        }
            char ans = '#';

            for(Map.Entry<Character, Integer> entry: myMap.entrySet()) {

                if (entry.getValue() == 1) {
                    ans = entry.getKey();
                    break;
                }
            }

                if (ans == '#'){
                    System.out.println(-1);
                }
                else{
                    for(int i=0; i<n; i++){
                        if(ans == str.charAt(i)){
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }



        }




