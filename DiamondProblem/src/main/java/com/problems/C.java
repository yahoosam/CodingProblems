package com.problems;

public interface C extends A {
    @Override
    default void method1() {
        System.out.println("Inside interface C");
    }
}
