/* Write a Java program that takes the lengths of the perpendicular sides from the user and calculates the hypotenuse of the triangle.
Write a program to calculate the area of the triangle, where the lengths of all three sides are provided by the user. */

package basicconseptsandvariables;

import java.util.Scanner;

public class TriangleHypotenuseAndAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int side1;
        int side2;
        double hypotenuse;

        System.out.print("\nEnter The First Side Of The Triangle : ");
        side1 = input.nextInt();
        System.out.print("Enter The Second Side Of The Triangle : ");
        side2 = input.nextInt();

        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("\nHypotenuse : " + hypotenuse); */

        int side1;
        int side2;
        int side3;
        double u;
        double area;

        System.out.print("\nEnter The First Side Of The Triangle : ");
        side1 = input.nextInt();
        System.out.print("Enter The Second Side Of The Triangle : ");
        side2 = input.nextInt();
        System.out.print("Enter The Third Side Of The Triangle : ");
        side3 = input.nextInt();

        u = (double) (side1 + side2 + side3) / 2;
        area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

        System.out.println("\nTriangle Area : " + area);

    }
}