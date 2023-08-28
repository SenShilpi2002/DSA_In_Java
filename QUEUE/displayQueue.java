package QUEUE;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import STACK.linkedlistImplementation;

public class displayQueue {
    public static void main(String[] args) {

        //adding the element

        Queue<Integer> q = new LinkedList<>();

        // rear ->5 4 3 2 1  -> front
        Queue<Integer> q2 = new ArrayDeque<>();
        while(q.size()>0){
            System.out.println(q.peek());
            q2.add(q.poll());
        }
        while(q2.size()>0){
            q.add(q2.poll());
        }










        
    }
}
