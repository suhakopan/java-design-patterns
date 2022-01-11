package main.java.bank;

public class B implements Bank {
    private final String BANK_NAME;

    public B() {
        this.BANK_NAME = "B";
    }

    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}
