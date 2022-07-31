package com.problems;

public interface B extends A {
    @Override
    default void method1() {
        System.out.println("Inside interface B");
    }
}
