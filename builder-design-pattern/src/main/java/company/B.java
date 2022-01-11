package main.java.company;

import main.java.domain.Company;

public class B extends Company {
    @Override
    public String pack() {
        return "B CD";
    }

    @Override
    public int price() {
        return 15;
    }
}
