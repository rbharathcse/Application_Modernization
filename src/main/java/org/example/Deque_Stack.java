package org.example;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;



public class Deque_Stack {
    public static void main(String[] args){
        Deque<Integer> d = new ArrayDeque<Integer>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.offer(4);

        System.out.println(d.peek());
        Iterator<Integer> itr = d.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        d.push(50);
        System.out.println(d.pop());
    }
}

