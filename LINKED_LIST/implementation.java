package LINKED_LIST;

import java.util.LinkedList;

public class implementation {

    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }


    //insertion function of a linked list
    public static class linkedlist{
        node head = null;
        node tail = null;
        void insertAtEnd(int data){
            node temp = new node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{       //if there have exsist node and want to add another nodes
                tail.next = temp;
            }
            tail = temp;
            
        }



    //displaing function
    public  void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }



    //find the size of the linked list

     public int size(){
        node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

}


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4); //4
        ll.insertAtEnd(67); //4 67
        ll.display();
        System.out.println(ll.size());
        
    }
}
