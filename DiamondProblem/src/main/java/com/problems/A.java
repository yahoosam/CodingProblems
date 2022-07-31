package com.problems;

public interface A {
    default void method1() {
        System.out.println("Inside interface A");
    }
}
