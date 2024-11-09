/* We are writing a Java program that checks if a number is an Armstrong number using loops. Write a program that
calculates the sum of the digits of a number.*/

package loops;

import java.util.Scanner;

public class ArmstrongAndDigitSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int userNumber;
        int tempNumber;
        int powerCount = 0;
        int value;
        int totalValue;
        int result = 0;


        System.out.print("\nEnter A Number : ");
        userNumber = input.nextInt();

        if (userNumber >= 0) {
            tempNumber = userNumber;

            while (tempNumber != 0) {
                tempNumber /= 10;
                powerCount++;
            }

            tempNumber = userNumber;

            while (tempNumber != 0) {
                value = tempNumber % 10;
                totalValue = 1;

                for (int i = 1; i <= powerCount; i++) {
                    totalValue *= value;
                }

                result += totalValue;
                tempNumber /= 10;
            }

            if (result == userNumber) {
                System.out.println("\n" + userNumber + " Is An Armstrong Number.");
            } else {
                System.out.println("\n" + userNumber + " Is Not An Armstrong Number.");
            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }*/

        int userNumber;
        int tempNumber;
        int value;
        int result = 0;

        System.out.print("\nEnter A Number : ");
        userNumber = input.nextInt();

        if (userNumber >= 0) {

            tempNumber = userNumber;

            while (tempNumber != 0) {
                value = tempNumber % 10;
                result += value;
                tempNumber /= 10;
            }

            System.out.println("\nThe Sum Of Digits In " + userNumber + " Is : " + result);

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}