package main.java.instantiation.lazy;

public class A {
    private static A instance;

    public A() {
    }

    public static A getInstance() {
        if (instance == null) {
            synchronized (A.class) {
                if (instance == null) {
                    instance = new A();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        // TODO: write your code
    }
}
