/* We are creating a triangle pattern with stars using loops in Java. Create a diamond pattern with stars
using loops in Java. */

package loops;

import java.util.Scanner;

public class TriangleAndDiamondStarPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int userNumber;

        System.out.print("\nPlease Enter The Value Of n : ");
        userNumber = input.nextInt();
        System.out.println();

        if (userNumber > 0) {
            for (int i = 0; i <= userNumber; i++) {
                for (int j = 0; j < (userNumber - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= ((2 * i) + 1); k++) {
                    System.out.print("*");
                }

                System.out.println();

            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } */

        int userNumber;

        System.out.print("\nPlease Enter The Value Of n : ");
        userNumber = input.nextInt();
        System.out.println();

        if (userNumber > 0) {
            for (int i = 1; i <= userNumber; i++) {
                for (int j = 1; j <= (userNumber - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= ((2 * i) - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();

            }

            for (int i = 1; i < userNumber; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= ((2 * userNumber) - ((2 * i) + 1)); k++) {
                    System.out.print("*");
                }

                System.out.println();

            }
        } else {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        }

    }
}