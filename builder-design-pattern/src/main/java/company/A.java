package main.java.company;

import main.java.domain.Company;

public class A extends Company {

    @Override
    public String pack() {
        return "A CD";
    }

    @Override
    public int price() {
        return 20;
    }
}
