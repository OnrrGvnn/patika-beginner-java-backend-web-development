// Write a Java program that calculates an exponent based on user-entered values using both "For" and "While" loops.

package loops;

import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int baseNumber;
        int exponentNumber;
        int i = 1;
        int total = 1;

        System.out.print("\nEnter The Base Number : ");
        baseNumber = input.nextInt();
        System.out.print("Enter the Exponent Number : ");
        exponentNumber = input.nextInt();

        if ((baseNumber >= 0) && (exponentNumber >= 0)) {
            if (baseNumber == 0 && exponentNumber == 0) {
                System.out.println("\n0 Raised To The Power Of 0 Is Considered An Indeterminate Form.");
            } else {
                while (i <= exponentNumber) {
                    total *= baseNumber;
                    i++;
                }

                System.out.println("\n" + baseNumber + " ^ " + exponentNumber + " = " + total);
            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } */

        int baseNumber;
        int exponentNumber;
        int total = 1;

        System.out.print("\nEnter The Base Number : ");
        baseNumber = input.nextInt();
        System.out.print("Enter the Exponent Number : ");
        exponentNumber = input.nextInt();

        if ((baseNumber >= 0) && (exponentNumber >= 0)) {
            if (baseNumber == 0 && exponentNumber == 0) {
                System.out.println("\n0 Raised To The Power Of 0 Is Considered An Indeterminate Form.");
            } else {
                for (int i = 1; i <= exponentNumber; i++) {
                    total *= baseNumber;
                }

                System.out.println("\n" + baseNumber + " ^ " + exponentNumber + " = " + total);

            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}