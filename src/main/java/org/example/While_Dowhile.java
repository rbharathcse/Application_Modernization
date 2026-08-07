package org.example;

import java.util.Scanner;

public class While_Dowhile {
    public static void while_method() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String uname = sc.next();
            String pwd = sc.next();
            if (uname.equals("Bharath") && pwd.equals("4321")) {
                System.out.println("Welcome Message");
                break;
            }
        }

    }

    public static void do_while_method(){
        Scanner sc = new Scanner(System.in);
        do {
            String uname = sc.next();
            String pwd = sc.next();
            if (uname.equals("prasunamba") && pwd.equals("4321")) {
                System.out.println("Welcome Message");
                break;
            }
        }while(true);




    }


    public static void main(String[] args) {
       while_method();
       do_while_method();
    }
}
