package main.Strings;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {


        //in this code understanding difference between char[] and String

        /*char a[] = new char[3];

        a[0] = 'X';
        a[1] = 'Y';
        a[2] = 'Z';

        //char is primitive datatype which have fixed size and are Mutable i.e. modifiable individual character.
        //char have class character but for char[] String is a wrapper class.
        //cannot perform concatination(+)


        System.out.println(a);
        a[0] = 'R';
        System.out.println(a);


        //String is User defined datatype which have fixed size and are Immutable i.e. non modifiable individual character.
        //we cant modify the character we can just print the character.
        //can perform concatination(+)



        String str = "XYZ";
        System.out.println(str);

        // str.charAt(0);

        str = "RaVInder";
        //str = "Ravi" + "nder";
        System.out.println(str);

         */

        //in this code we changing String into Char[] and for taking out single character from String

        /*String str = "RAVI";
        int n = str.length();
        //for length/size of string

        //char ch[] = str.toCharArray();
        //for changing string to char array


        char ch[] = {'R', 'A', 'V', 'I'};
        char a[] = "RAVI".toCharArray();
        //both above 2 ines changing string to char array


        char c = "RAVI".charAt(1);
        //for taking out single char
        System.out.println(c);

         */

        //in this code we understanding that a==b bcoz in string pool a string got created "Ravi" and both a & b
        // started pointing the same value i.e. "Ravi" so a & b reffering to the same reference but a==c is not true.
        //bcoz we created a new String c then it created new reference "Ravi" and c referring to different refernce.
        //== compares reference not values

        /*String a = "Ravi";
        String b = "Ravi";

        String c = new String("Ravi");

        System.out.println(a == b);
        System.out.println(a == c);

         */

        //in this code it compares value that why a==c is also true

        /*String a = "Ravi";
        String b = "Ravi";

        String c = new String("Ravi");
        //String c = new String("ABCD");
        // above line prove a==c is false bcoz value is changed



        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

         */

        //in this code it compares the strings and print the difference of it.

        /*String x = "ABCD";
        String y = "XYZ";

//        String x = "C";
//        String y = "A";

//        String x = "CD";
//        String y = "CA";

//        String x = "CA";
//        String y = "CA";

        System.out.println(x.compareTo(y));

         */

        //in this code it tells the index of string.


        /*String str = "RAVINDER";

        System.out.println(str.indexOf("D"));

         */


        //and  like concatination i.e. '+' we can use str.concat

        /*String str = "RAVINDER";

        str = str.concat("Chauhan");
        System.out.println(str);

         */


        //in this code as java is case sensitive so in a.equals() it will show false due to case sensitivity.

        /*String a = "Ravi";
        String b = "Ravi";

        String c = new String("RAVI");


        System.out.println(a.equals(b));
        //System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        //System.out.println(a.compareTo(c));
        //both does same work

         */


        //in this code we can replace the characters.
        // as Strings are immutable so its not like we changed directly the character in String pool new string
        // created named "XAVINDEX" and now str pointing to it.


        /*String str = "RAVINDER";

        str = str.replace('R', 'X' );
        System.out.println(str);

         */

        //in this code we have String and we converting the character of string into integer.
        //as r = ch and it prints 49 thats the asci value of 1.

        String str = "123";

        char ch = str.charAt(0);

        int r = ch;

        System.out.println(ch);
        System.out.println(r);

               //49 - 48 is the aski value of ch = '1' & '0' respectively
         r =  ch - '0';
        System.out.println(r);
        //'0' is the character not integer



    }

}
