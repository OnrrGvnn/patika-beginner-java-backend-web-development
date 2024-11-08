/* We are writing a Java program that continuously accepts user input until a negative value is entered, then sums the
odd numbers from the entered values and displays the result. We are writing a Java program that continuously accepts
user input until an odd number is entered, then sums the values that are even and multiples of 4 from the entered
values and displays the result. */

package loops;

import java.util.Scanner;

public class ConditionalSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int userNumber;
        int total = 0;

        do {
            System.out.print("\nPlease Enter A Number : ");
            userNumber = input.nextInt();

            if (userNumber % 2 == 1) {
                System.out.print("-----> Odd Number");
                total += userNumber;
            } else if (userNumber < 0) {
                System.out.println("The Program Has Ended Because You Entered A Negative Number.");
            } else {
                System.out.print("-----> Even Number");
            }
        } while (userNumber > 0);

        System.out.println("\nSum Of The Entered Odd Numbers : " + total); */

        int userNumber;
        int total = 0;

        do {
            System.out.print("\nPlease Enter A Number : ");
            userNumber = input.nextInt();

            if (userNumber % 4 == 0) {
                System.out.print("-----> This Number Is A Multiple Of 4.");
                total += userNumber;
            } else if (userNumber % 2 == 1) {
                System.out.println("The Program Has Ended Because You Entered A Odd Number.");
            } else {
                System.out.print("-----> This Number Is Not A Multiple Of 4.");
            }
        } while (userNumber % 2 == 0);

        System.out.println("\nSum Of The Entered Numbers That Are Multiples Of 4 : " + total);

    }
}