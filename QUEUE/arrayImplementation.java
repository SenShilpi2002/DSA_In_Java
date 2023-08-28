package QUEUE;

import java.util.LinkedList;

public class arrayImplementation {
    public static class QueueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int [] arr = new int [10];

        //add function
        public  void add(int data){
            if(rear==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){ //currently queue is empty
                front = rear = 0;
                arr[0] = data;
            }
            else{
                arr[rear+1] = data;
            }
            size++;
        }



        //remove funtion
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int data = arr[front];
            front++;
            size--;
            return data;

        }



        //peek element
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            return arr[front];
        }




            
        //display elements
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
        }
        for(int i=front ; i<= rear ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
      QueueA q = new QueueA();
      q.display();
    }
}
