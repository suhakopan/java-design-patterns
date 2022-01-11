package main.java.factory;

import main.java.bank.A;
import main.java.bank.B;
import main.java.bank.Bank;
import main.java.bank.C;
import main.java.loan.Loan;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("A")){
            return new A();
        } else if(bank.equalsIgnoreCase("B")){
            return new B();
        } else if(bank.equalsIgnoreCase("C")){
            return new C();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
