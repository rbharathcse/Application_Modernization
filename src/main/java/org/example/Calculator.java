package org.example;

import java.util.ArrayList;
import java.util.Arrays;

interface calculator{
    int compute (int a,int b);
}
public class Calculator {

    public static void main(String[] args){
        calculator Add = (int a,int b)-> a+b;
        calculator Sub = (int a,int b)-> a>b?a-b:b-a;
        calculator Mul = (int a,int b)-> a*b;
        calculator Div = (int a,int b)-> a>b?a/b:b/a;

        System.out.println(Add.compute(1,2));
        System.out.println(Sub.compute(1,2));
        System.out.println(Mul.compute(1,2));
        System.out.println(Div.compute(1,2));

        // Finding Even numbers in Array List using Lambda expression.
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        al.forEach(num->{
            if(num%2==0){
                System.out.println(num);
            }
        });


    }

}
