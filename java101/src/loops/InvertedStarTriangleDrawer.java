/* Write a program in Java that takes the number of rows from the user and uses loops to draw an inverted triangle
on the screen with asterisks (*). */

package loops;

import java.util.Scanner;

public class InvertedStarTriangleDrawer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows;

        System.out.print("\nEnter The Number Of Rows : ");
        rows = input.nextInt();

        System.out.println();

        if (rows > 0) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= ((2 * rows) - ((2 * i) - 1)); j++) {
                    System.out.print("*");
                }

                System.out.println();

            }

        } else {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        }

    }
}