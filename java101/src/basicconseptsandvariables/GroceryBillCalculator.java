/* Write a Java program that calculates and displays the total cost based on the kilogram values of products
purchased by the user from the grocery store. */

package basicconseptsandvariables;

import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pricePear = 2.14;
        double priceApple = 3.67;
        double priceTomato = 1.11;
        double priceBanana = 0.95;
        double priceEggplant = 5;
        double total;
        int kgPear;
        int kgApple;
        int kgTomato;
        int kgBanana;
        int kgEggplant;

        System.out.print("\nPlease Enter The Quantity Of Pears You Would Like To Purchase : ");
        kgPear = input.nextInt();
        System.out.print("Please Enter The Quantity Of Apples You Would Like To Purchase : ");
        kgApple = input.nextInt();
        System.out.print("Please Enter The Quantity Of Tomatoes You Would Like To Purchase : ");
        kgTomato = input.nextInt();
        System.out.print("Please Enter The Quantity Of Bananas You Would Like To Purchase : ");
        kgBanana = input.nextInt();
        System.out.print("Please Enter The Quantity Of Eggplants You Would Like To Purchase : ");
        kgEggplant = input.nextInt();

        total = ((pricePear * kgPear) + (priceApple * kgApple) + (priceTomato * kgTomato) + (priceBanana * kgBanana) + (priceEggplant * kgEggplant));

        System.out.println("\nTotal Price : " + total + " TL");

    }
}