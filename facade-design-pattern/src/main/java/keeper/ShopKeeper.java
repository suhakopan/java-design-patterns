package main.java.keeper;

import main.java.shop.Audi;
import main.java.shop.BMW;
import main.java.shop.CarShop;
import main.java.shop.Mercedes;

public class ShopKeeper {
    private CarShop bmw;
    private CarShop mercedes;
    private CarShop audi;

    public ShopKeeper() {
        this.bmw = new BMW();
        this.mercedes = new Mercedes();
        this.audi = new Audi();
    }

    public void bmwSale() {
        bmw.brand();
        bmw.price();
    }

    public void mercedesSale() {
        mercedes.brand();
        mercedes.price();
    }

    public void audiSale() {
        audi.brand();
        audi.price();
    }
}
