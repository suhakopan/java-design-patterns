package main.java.shop;

public class Audi implements CarShop {
    @Override
    public void brand() {
        System.out.println("Audi");
    }

    @Override
    public void price() {
        System.out.println("$45.000");
    }
}
