//linked list implementation in java
//1:14:37
import java.util.*;
public class singlyLL{

    
     public static void displayr(node head) {//recursivly
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        displayr(head.next);
    }


    
    public static void displayreverse(node head) {//reverse recursivly
        if(head==null){
            return;
        }
        displayreverse(head.next);
        System.out.print(head.data+" ");
    }



    public static void display(node head){
        node temp=head;         //only given the head  and printing the whole linked list
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }





    //implement a method to find out the length of a linked list(iterative and recursive)
    public static int length(node a) {
    count=0;
    while(head!=null){
        count_++;
        head=head.next;
    }
    return count;
}


     public static class node{
        int data;
        noce next;
        node(int data){     //making constructor
            this.data=data;
        }
    }

    public static void main(String[] args) {
        node a= new node(5);
        node b= new node(8);
        node c= new node(23);
        node d= new node(78);
        node e= new node(4);
        //5->8->23->78->4

        a.next=b;   //creating linkedlist in general process
        b.next=c;
        c.next=d;
        d.next=e;

      node temp = a;
      while(temp!=null){    // printing or displaying a linked list
        System.out.print(temp.data+" ");
        temp=temp.next;
      }

      display(a);
      System.out.println();
      displayr(a); // again want to print the linked list by using recursive function







        //System.out.println(x.next);

    }

}

