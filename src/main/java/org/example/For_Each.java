package org.example;

public class For_Each {
    public static void method(){
        String [] cust = new String[]{"Bharath","Kumar","R"};
        for(String s:cust){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        method();
    }

}
