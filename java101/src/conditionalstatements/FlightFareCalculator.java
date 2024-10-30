/* Write a Java program that calculates the airplane ticket price based on distance and conditions. Get the distance (in KM),
age, and type of trip (One-Way or Round-Trip) from the user. The rate per kilometer is 0.10 TL/km. First, calculate
the total price of the flight and then apply the following discounts based on the conditions below:

- The values entered by the user should be valid (distance and age should be positive numbers, and the type of
trip should be either 1 or 2). Otherwise, display a warning message: "Invalid Data Entered!"
- If the person is under 12 years old, apply a 50% discount on the ticket price.
- If the person is between 12 and 24 years old, apply a 10% discount on the ticket price.
- If the person is over 65 years old, apply a 30% discount on the ticket price.
- If the trip type is chosen as "Round-Trip," apply an additional 20% discount on the ticket price. */

package conditionalstatements;

import java.util.Scanner;

public class FlightFareCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        int km;
        int tripType;
        double perKm = 0.10;
        double ageDiscount1 = 0.50;
        double ageDiscount2 = 0.10;
        double ageDiscount3 = 0.35;
        double tripTypeDiscount = 0.20;
        double price;
        boolean isError = false;

        System.out.print("\nEnter The Distance Traveled In Kilometers : ");
        km = input.nextInt();
        System.out.print("Enter Your Age : ");
        age = input.nextInt();
        System.out.print("Enter The Trip Type (1 => One Way, 2 => Round Trip) : ");
        tripType = input.nextInt();

        price = km * perKm;

        if (km > 0) {
            if (age > 0) {
                if (age < 12) {
                    price -= (price * ageDiscount1);
                } else if (age <= 24) {
                    price -= (price * ageDiscount2);
                } else if (age > 65) {
                    price -= (price * ageDiscount3);
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        switch (tripType) {
            case 1:
                break;
            case 2:
                price = ((price - (price * tripTypeDiscount)) * 2);
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.print("\nYou Made An Invalid Entry. Please Try Again!\n");
        } else {
            System.out.println("\nTotal Price : " + price + " TL");
        }

    }
}