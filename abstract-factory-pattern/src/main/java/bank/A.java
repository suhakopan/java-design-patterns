package main.java.bank;

public class A implements Bank {
    private final String BANK_NAME;

    public A() {
        this.BANK_NAME = "A";
    }

    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}
