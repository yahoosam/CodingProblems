package com.problems;

/*
All the 3 interfaces A, B & C has implementation of default method1() method. Interface B and C extends interface A

Class D implements interface B & C, now D is unable to determine which version of method1() to use.
Whether to use Interface B's default method1() or C's default method method1()
In this case, D class should override method1() to avoid error.

Through this way multiple inheritance through Interfaces are possible but not allowed with Class.
*/
public class D implements B, C {
    public static void main(String[] args) {
        System.out.println("Diamond Problem demo!");
        new D().method1();
    }

    @Override
    public void method1() {
        System.out.println("Inside Class D");
    }
}