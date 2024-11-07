/* We are writing a Java program that finds the even numbers up to the number entered by the user using loops. Write
a Java program that calculates the average of numbers from 0 up to the entered number that are divisible by
both 3 and 4 using loops. */

package loops;

import java.util.Scanner;

public class DivisibilityAndEvenCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        System.out.println();

        for (int i = 1; i <= userNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); */

        int userNumber;
        int total = 0;
        int numberCount = 0;
        double average;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        System.out.println();

        if (userNumber > 0) {
            for (int i = 1; i <= userNumber; i++) {
                if ((i % 3 == 0) && (i % 4 == 0)) {
                    System.out.print(i + " ");
                    total += i;
                    numberCount++;
                }
            }

            System.out.println();

            average = (double) total / numberCount;

            System.out.println("\nTotal : " + total);
            System.out.println("Number Count : " + numberCount);
            System.out.println("\nAverage : " + average);

        } else {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        }

    }
}