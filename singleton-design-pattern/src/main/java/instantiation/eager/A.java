package main.java.instantiation.eager;

public class A {
    private static final A instance = new A();

    public A() {
    }

    public static A getInstance() {
        return instance;
    }

    public void doSomething() {
        // TODO: write your code
    }
}
