package main.java.domain;

public class PhoneDecorator implements Phone {

    private Phone basicPhone;

    public PhoneDecorator(Phone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int getMemory() {
        return basicPhone.getMemory();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}
