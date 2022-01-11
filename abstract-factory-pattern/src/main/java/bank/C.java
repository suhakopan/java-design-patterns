package main.java.bank;

public class C implements Bank {
    private final String BANK_NAME;

    public C() {
        this.BANK_NAME = "C";
    }

    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}
