/* Write a Java program that calculates the area and circumference of a circle, given its radius by the user. Write a
program to calculate the area of a circular sector with radius r and central angle 𝛼. */

package basicconseptsandvariables;

import java.util.Scanner;

public class CircleAreaAndCircumferenceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* double r;
        double area;
        double circumference;

        System.out.print("\nEnter The Radius Of The Circle : ");
        r = input.nextDouble();

        area = Math.PI * r * r;
        circumference = 2 * Math.PI * r;

        System.out.println("\nThe Area of the Circle is : " + area);
        System.out.println("The Circumference of the Circle is : " + circumference); */

        double r;
        double angle;
        double sectorArea;

        System.out.print("\nEnter The Radius Of The Circle : ");
        r = input.nextDouble();
        System.out.print("Enter The Measure Of The Central Angle : ");
        angle = input.nextDouble();

        sectorArea = (Math.PI * r * r * angle) / 360;

        System.out.println("\nCircular Sector Area : " + sectorArea);

    }
}