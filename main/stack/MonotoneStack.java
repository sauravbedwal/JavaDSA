package main.stack;

import java.util.Stack;

public class MonotoneStack {
    public static void main(String[] args) {

        int a[] = {2, 7, 1, 9, 5, 3, 6, 2};
        int n = a.length;

        Stack<Integer> myStack = new Stack<>();

        for (int i=0; i<n; i++){
            if (!myStack.empty()){    //pushed 2 coz it empty for 1st run
                myStack.push(a[i]);
            }
            else {
                while(!myStack.empty() && myStack.peek() <= a[i]){   //here peek is 2 and a[i] is 7 for sec. run
                    System.out.println(myStack.pop() + " -->" + a[i]);
                }
                myStack.push(a[i]);    //pushed 7
            }
        }

        while (!myStack.empty()){
            System.out.println(myStack.pop() + "-->" + -1);
        }


    }
}
