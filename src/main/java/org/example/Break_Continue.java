package org.example;

import java.util.Scanner;

public class Break_Continue {
    public static void method(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            if(i==2){
                System.out.println("Breaked");
                break;
            }
        }
        for(int j = 0 ;j<5;j++){
            if(j==2){
                System.out.println("Skipped");
                continue;
            }
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        method();
    }


}
