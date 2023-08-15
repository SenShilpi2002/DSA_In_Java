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



    //insertAtBeginning->implement a method to insert a node at the start of a linked list
       void insertAtHead(int data){
        node temp = new node(data);
        if(head==null){
            head = tail =temp;
        }
        else{   //non empty
            temp.next = head;
            head = temp;

        }
    }


    //insert method->implement a method to insert a node at any given index

    void insertAt(int idx , int data){
        node newnode = new node(data);
        node temp = head;

        if(idx==size()){     //this condition willwork only,when we want to add a new node add the end and that last node will become contain the tail value...that time this value will be return;
            insertAtEnd(data);
            return;
        }
        else{               //if want add a new node in 0 index
            if(idx==0){
                insertAtHead(data);
                return;
            }
        }
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    } 





    //getElementmethod
    int getAt(int idx){
        node temp = head;
        for(int i = 1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;
    }





    //deletion method
    void deleteAt(int idx){
        node temp = head;
        if(idx==0){
            head=head.next;
            return;
        }
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
    }

}


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4); //4
        ll.insertAtEnd(67); //4-> 67
        ll.display();
        System.out.println(ll.size());
        ll.insertAtEnd(34);  //4->67->34
        ll.insertAtHead(60);  //4->67->34->60
        ll.display();
        ll.insertAt(2, 30); //4->67->30->34->60
         System.out.println(ll.tail.data);  //here it will return 60
        ll.insertAt(5,10 );   //4->67->30->34->60->10
        System.out.println(ll.tail.data); //in this case tail value return the last index value after insert in the end (explain in line 80)
        ll.insertAt(0,100 );    //line 84
         System.out.println(ll.getAt(3)); 

         ll.deleteAt(2);
         ll.display();
    }
}
