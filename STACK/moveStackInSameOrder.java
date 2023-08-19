package STACK;

import java.util.Stack;;
import java.util.Scanner;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        // copy stack -> copy contents of one stack to another in same order
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        // int n;
        // System.out.println("Enter the number of elements ");
        // n = sc.nextInt();
        // System.out.println("Enter the elements ");
        // for(int i=1;i<=n;i++){
        // int x = sc.nextInt();
        // st.push(x);

        // reverse order
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            gt.push(x);
            st.pop();

        }
        Stack<Integer> rt = new Stack<>();
        while (gt.size() > 0) {
            rt.push(gt.pop());
        }
        System.out.println(rt);

    }

}}
