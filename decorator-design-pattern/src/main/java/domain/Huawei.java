package main.java.domain;

public class Huawei implements Phone {
    @Override
    public String getName() {
        return "Huawei";
    }

    @Override
    public int getMemory() {
        return 16;
    }

    @Override
    public double getPrice() {
        return 100.0;
    }
}
