package org.example;

public class Static_Nonstatic {
    static int j = 0;
    public static void method1(){
        int i = 0;
        i++;
        j++;
        System.out.println(i);
        System.out.println(j);

    }

    public static void main(String[] args) {
        method1();
        method1();
        method1();
    }

}
