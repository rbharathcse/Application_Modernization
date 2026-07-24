package org.example;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCustom {
    public static Node head = null;
    public  void Add(int num){
        if(head == null){
            Node n = new Node(num);
            head = n;
        }
        else{
            Node n = new Node(num);
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void deleteFirst(){
        head = head.next;
    }

}

class Implementation{
    public static void main(String[] args){
        LinkedListCustom li = new LinkedListCustom();
        li.Add(1);
        li.Add(2);
        li.Add(3);
        li.display();
        li.deleteFirst();
        li.display();
    }

}

