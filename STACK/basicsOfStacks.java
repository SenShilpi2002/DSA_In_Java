package STACK;

//import java.util.ArrayList;
//import java.util.Stack;
import java.util.*;


public class basicsOfStacks {
    public static void main(String[] args) {
        
        //int arr[] = new int [5];
    //ArrayList<Integer> arr = new ArrayList<>();
    Stack<Integer> st = new Stack<>();
    System.out.println("size is : " + st.size());
    st.push(1);
    st.push(89);
    st.push(67);
    st.push(78);

    //peek

    System.out.println(st.peek());
    // System.out.println(st);
    // st.pop();
    // System.out.println(st);
    // st.pop();
    // System.out.println(st);
    System.out.println("size is : " + st.size());
    while(st.size()>1){
        st.pop();
    }

    System.out.println(st.peek());





    }

    
}
