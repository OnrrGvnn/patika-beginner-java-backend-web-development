/* Write a Java program that calculates and prints the fare based on the distance traveled (in KM).
The taximeter charges 2.20 TL per kilometer. The minimum fare is 20 TL. If the calculated fare is less than 20 TL,
the user will still be charged 20 TL. The starting fare for the taximeter is 10 TL. */

package basicconseptsandvariables;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        double perKm = 2.20;
        double startPrice = 10;
        double price;
        double totalPrice;

        System.out.print("\nEnter The Distance Traveled In Kilometers : ");
        km = input.nextDouble();

        price = startPrice + (km * perKm);
        totalPrice = (price <= 20) ? 20 : price;

        System.out.println("\nTaximeter Price : " + totalPrice);

    }
}