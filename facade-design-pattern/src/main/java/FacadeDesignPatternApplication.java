package main.java;

import main.java.keeper.ShopKeeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeDesignPatternApplication {
    private static int  choice;
    public static void main(String[] args) throws IOException {
        do{
            System.out.print("========= Car Shop ============ \n");
            System.out.print("            1. BMW.              \n");
            System.out.print("            2. MERCEDES.              \n");
            System.out.print("            3. AUDI.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper sk = new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.bmwSale();
                }
                break;
                case 2:
                {
                    sk.mercedesSale();
                }
                break;
                case 3:
                {
                    sk.audiSale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        } while(choice!=4);
    }
}
