package QUEUE;

public class linkedlistImplementation {

    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }

    public static class queueLl{


        //implementing the adding operation
        node head = null;
        node tail = null;
        int size = 0;

        public void add(int value){
            node temp = new node(value);
            if(size==0){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }



        //implementing the peek element
        public int peek(){
            if(size==0){
                System.out.println("queue is empty!");
                return -1;
            }
           return head.data;

        }


        //implementing the remove operation
        public int remove(int value){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }


        //displaying output
        public void displayQueue(){
            if(size==0){
                System.out.println("Queue is empty!");
        }
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        queueLl q1 = new queueLl();
        q1.add(8);
        q1.add(78);
        q1.add(7);
        q1.add(68);
        q1.add(18);
        q1.displayQueue();
        q1.peek();
        q1.remove(78);
        

    }
}
