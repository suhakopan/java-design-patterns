package main.java.type;

import main.java.company.A;
import main.java.company.B;

public class CDBuilder {
    public CDType buildACD(){
        CDType cds = new CDType();
        cds.addItem(new A());
        return cds;
    }
    public CDType buildBCD(){
        CDType cds = new CDType();
        cds.addItem(new B());
        return cds;
    }
}
