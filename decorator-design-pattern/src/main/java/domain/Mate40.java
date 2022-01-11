package main.java.domain;

public class Mate40 extends PhoneDecorator {

    public Mate40(Phone basicPhone) {
        super(basicPhone);
    }

    public String getName() {
        return super.getName() + " Mate 40";
    }

    public int getMemory() {
        return super.getMemory() * 32;
    }

    public double getPrice() {
        return super.getPrice() * 8;
    }
}
