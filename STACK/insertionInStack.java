package STACK;

import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);


        int idx = 2;
        int x = 10;

        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        //System.out.println(temp);
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
