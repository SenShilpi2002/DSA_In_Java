package STACK;

public class linkedlistImplementation {
    public static class node {  //user defined data type
        int data;
        node next;
         node(int data){
             this.data = data;
        }
        
    }


    public static class llStack{    //user defined data structure
        node head = null;
        int size = 0;
        void push(int x){
            node temp = new node(x);
            temp.next = head;
            head = temp;
            size++;
        }





        void display(node head){
            if(head==null){
                return;
            }
           display(head.next);
           System.out.print(head.data+" ");
            
            
        }




        int size(){ //getter
           /*  node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }*/
            return size;
        }




        int pop(){
            if(head==null){
                System.out.println("Stack is EMPTY");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }





        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
             return head.data;
        }

    }
    public static void main(String[] args) {
        llStack st = new llStack();
    }
}
