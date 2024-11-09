/* We are writing a Java program that displays the powers of 2 up to the entered number using loops. We are writing a
Java program that displays the powers of 4 and 5 up to the entered number using loops.*/

package loops;

import java.util.Scanner;

public class MultiplePowersPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            System.out.print("\nPowers Of Two : ");

            for (int i = 1; i <= userNumber; i *= 2) {
                System.out.print(i + " ");
            }

            System.out.println();

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } */

        int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            System.out.print("\nPowers Of Four : ");

            for (int i = 1; i <= userNumber; i *= 4) {
                System.out.print(i + " ");
            }

            System.out.print("\nPowers Of Five : ");

            for (int i = 1; i <= userNumber; i *= 5) {
                System.out.print(i + " ");
            }

            System.out.println();

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}