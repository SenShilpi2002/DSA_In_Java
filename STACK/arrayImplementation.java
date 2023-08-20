package STACK;

import java.util.Stack;

public class arrayImplementation {

    public static class Stack {
        private int[] arr = new int[10];
        private int idx = -1;

        void push(int x);

        {
            arr[idx] = x;
            idx++;
        }



        int peek() {
            if (idx == 0) {
                System.out.println("Empty! ");
                return -1;
            }
            return arr[idx - 1];
        }




        int pop() {
            if (idx == 0) {
                System.out.println("Empty!");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0; // store by default value "0"...
            idx--;
            return top;
        }






        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
        




        
        int size(){
            return idx;
        }



        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else{
                return false;
            }
        }





         boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            else{
                return false;
            }
        }
    }




    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        St.push(5);
        st.display();
        System.out.println(st.size());
        st.pop();
    }
}
