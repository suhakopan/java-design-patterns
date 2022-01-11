package main.java.shop;

public class Mercedes implements CarShop {
    @Override
    public void brand() {
        System.out.println("Mercedes");
    }

    @Override
    public void price() {
        System.out.println("$75.000");
    }
}
