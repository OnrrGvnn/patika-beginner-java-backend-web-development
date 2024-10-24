/* Write a Java program that takes a monetary value from the user, calculates the VAT (Value Added Tax) included price
and the VAT amount, and prints them on the screen(Note: Use 18% as the VAT rate). If the entered amount is between
0 and 1000 TL, calculate the VAT amount using an 18% rate. If the amount is greater than 1000 TL, use an 8% VAT rate. */

package basicconseptsandvariables;

import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* double price;
        double kdvRate = 0.18;
        double kdvPrice;
        double totalPrice;

        System.out.print("\nPlease Enter The Price : ");
        price = input.nextDouble();

        kdvPrice = price * kdvRate;
        totalPrice = price + kdvPrice;

        System.out.println("\nPrice : " + price + " TL");
        System.out.println("KDV Rate : " + kdvRate);
        System.out.println("KDV Price : " + kdvPrice + " TL");
        System.out.println("\nTotal Price : " + totalPrice + " TL"); */

        double price;
        double kdvRate;
        double kdvPrice;
        double totalPrice;

        System.out.print("\nPlease Enter The Price : ");
        price = input.nextDouble();

        kdvRate = (price > 0 && price <= 1000) ? 0.18 : 0.08;
        kdvPrice = price * kdvRate;
        totalPrice = price + kdvPrice;

        System.out.println("\nPrice : " + price + " TL");
        System.out.println("KDV Rate : " + kdvRate);
        System.out.println("KDV Price : " + kdvPrice + " TL");
        System.out.println("\nTotal Price : " + totalPrice + " TL");

    }
}