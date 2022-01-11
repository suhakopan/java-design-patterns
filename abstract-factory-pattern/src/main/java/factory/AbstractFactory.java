package main.java.factory;

import main.java.bank.Bank;
import main.java.loan.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
