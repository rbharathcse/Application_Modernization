package org.example;
class Parent {
    public void override(int num){
        System.out.println("Parent Method");
    }
    public void overload(int num){
        System.out.println(num);
    }
    public void overload(int num1,int num2){
        System.out.println( num1 + num2);
    }
}

class Child extends Parent{
    public void override(int num){
        System.out.println("child method");
    }

}
class Method_Overriding_Overloading {
    public static void main(String[] args) {
        Child c = new Child();
        c.override(1);
        Parent p = new Child();
        p.override(2);
        Parent p1 = new Parent();
        p1.overload(1,2);
        p1.overload(1);
    }

}

