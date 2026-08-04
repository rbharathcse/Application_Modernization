package org.example;

import java.util.Scanner;

public class Switch {
    public static void switch_method(){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        switch (num){
            case 1: {
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            default:{
                System.out.println("default");
                break;
            }

        }

    }

    public static void main(String[] args) {
        switch_method();
    }

}
