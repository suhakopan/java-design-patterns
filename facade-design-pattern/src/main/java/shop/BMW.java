package main.java.shop;

public class BMW implements CarShop {
    @Override
    public void brand() {
        System.out.println("BMW");
    }

    @Override
    public void price() {
        System.out.println("$60.000");
    }
}
