package main.java;

import main.java.domain.Huawei;
import main.java.domain.Mate30;
import main.java.domain.Mate40;
import main.java.domain.Phone;

public class DecoratorDesignPatternApplication {
    public static void main(String[] args) {
        Phone phone = new Mate30(new Huawei());

        System.out.println(" Name : " + phone.getName());
        System.out.println(" Price : " + phone.getPrice());
        System.out.println(" Memory : " + phone.getMemory());

        System.out.println("================================");

        Phone phone2 = new Mate40(new Huawei());

        System.out.println(" Name : " + phone2.getName());
        System.out.println(" Price : " + phone2.getPrice());
        System.out.println(" Memory : " + phone2.getMemory());
    }
}
