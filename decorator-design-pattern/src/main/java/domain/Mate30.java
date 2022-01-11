package main.java.domain;

public class Mate30 extends PhoneDecorator {

    public Mate30(Phone basicPhone) {
        super(basicPhone);
    }

    public String getName() {
        return super.getName() + " Mate 30";
    }

    public int getMemory() {
        return super.getMemory() * 16;
    }

    public double getPrice() {
        return super.getPrice() * 4;
    }
}
