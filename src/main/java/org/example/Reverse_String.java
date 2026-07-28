package org.example;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String in = sc.next();

        char[] arr = in.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        String reversed = new String(arr);
        System.out.println(reversed);


    }
}
