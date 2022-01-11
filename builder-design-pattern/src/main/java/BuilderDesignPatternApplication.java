package main.java;

import main.java.type.CDBuilder;
import main.java.type.CDType;

public class BuilderDesignPatternApplication {
    public static void main(String[] args) {
        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1=cdBuilder.buildACD();
        cdType1.showItems();

        CDType cdType2=cdBuilder.buildBCD();
        cdType2.showItems();
    }
}
