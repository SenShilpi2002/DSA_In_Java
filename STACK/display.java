package STACK;

import java.util.Stack;

public class display {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        //System.out.println(st);
        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //    rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //     int x = rt.pop();
        //     System.out.println(x+" ");
        //     st.push(x);
        // }
        // System.out.println(st);


        //by using array
        int n = st.size();
        int arr[] = new int [n];
        for(int i=n-1;i>=0;i++){
            arr[i] = st.pop();
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }



        //pushAtBottom

        //normal process


        // Stack<Integer> rt = new Stack<>();
        // int x = 10;
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // st.push(x);
        // while(rt.size()>0){
        //     st.push(rt.pop());
        // }
        // System.out.println(st);
        public static void pushAtBottom(Stack<Integer> st ,int x){
            if(st.size()==0){
                st.push(x);
                return;
            }
            int top = st.pop();
            pushAtBottom(st,x);
            st.push(top);
        }

        //display by recursively

        public static void displayRecur(Stack<Integer> st){
            if(st.size()==0){
                return;
            }
            int top = st.pop();
            System.out.println(top+" ");
            displayRecur(st);
            st.push(top);
        }


        //display reverse by recursively

        /* 
         * Stack<Integer> rt = new Stack<>();
         * Stack<Integer> gt = new Stack<>();
         * while(st.size()>0){
         * rt.push(st.pop());
         * }
         * System.out.println(rt);
         * while(rt.size()>0){
         * gt.push(rt.pop());
         * }
         * System.out.println(gt);
         * while(gt.size()>0){
         * st.push(gt.pop());
         * }
         * System.out.println(st);
         */
        
        public static void reverseRecur(Stack<Integer> temp){
            if(st.size()==1){
                return;
            }
            int top = temp.pop();
            reverseRecur(temp);
            pushAtBottom(st,top);
        }







    }
}




//call stack->












