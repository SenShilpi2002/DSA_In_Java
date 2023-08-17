package LINKED_LIST;

public class doublyll {
    public static class node{    //note that we take up more memory->(4+4+4=12)
        int data;
        node next;
        node prev;
        node(int data){
            this.data = data;
        }
    }

    public static void display(node head){
        node temp = head; 
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void duisplayrev(node tail) {
        node temp2 = tail;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.prev;
        }
        System.out.println();
    }




    //picking random node and print the list
    public static void display2(node random){
        node temp = random;
        //move this temp backwords to the head
        while(temp.prev!=null){
            temp = temp.prev;
        }
        //now temp is at head
        //print the list
         while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }






    public static node insertAtHead(node head,int val){ // insertion at head DLL 
        node newnode = new node(val);

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        return head;
    }




    public static void insertAtTail(node head , int val){   //inser at tail in DLL
        node temp = head;
        while(temp!=null){
            temp = temp.next;
        node t = new node(val);
        temp.next = t;
        t.prev = temp;
        }
    }




    public static void inserAtIdex(node head,int idx,int x){    //insert at any index in DLL
           node temp = head;
           node t = new node(x);
           for(int i=0;i<=idx-1;i++){
                temp = temp.next;
           }
           temp.next.prev = t;
           t.prev = temp;
           t.next = temp.next;
           temp.next = t;

           /*
           //another proccess to add node at any index
            * node r = temp.next;
            node t = new node(x);
            temp.next = t;
            t.prev = temp;
            t.next = r;
            r.prev = t;
            */

        }




    public static void main(String[] args) {
        //4 56 12 7 6
        node a = new node(4);
        node b = new node(44);
        node c = new node(444);
        node d = new node(457);
        node e = new node(489);
        display(a);
        duisplayrev(e);
        display2(d);
        node newHead = insertAtHead(a,78);
        display(newHead);

        insertAtTail(a, 70);
        display(a);    
        inserAtIdex(a, 3, 70);
        display(a);
    }
}


/*
 * can we creat a doubly linked kist using one pointer with every node?
 * 1. not,possible
 * 2. yes,possible
 * 
 * yes its possible by storing XOR of addresses of previous and next address
 */