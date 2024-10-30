/* Write a Java program that determines if the year entered by the user is a leap year. */

package conditionalstatements;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("\nPlease Enter The Year : ");
        year = input.nextInt();

        if (year > 0) {
            if ((year % 4 == 0) && ((year % 100) != 0) || (year % 400 == 0)) {
                System.out.println("\n" + year + " Is A Leap Year.");
            } else {
                System.out.println("\n" + year + " Is Not A Leap Year.");
            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}