package QUEUE;

import java.util.LinkedList;
import java.util.Queue;;

public class basicOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.isEmpty());
        q.add(5);
        q.add(6);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());  //q.peek()
        System.out.println(q.size());
    }
}
