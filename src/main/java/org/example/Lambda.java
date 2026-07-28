package org.example;

interface display{
    void display_Message(String msg);
}

public class Lambda {
    public static void main(String[] args) {
        display d = (msg)-> System.out.println(msg);
        d.display_Message("Hi");
    }
}
