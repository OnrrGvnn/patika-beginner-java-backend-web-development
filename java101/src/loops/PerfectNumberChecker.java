/* Write a program in Java that determines whether a number entered from the keyboard is a perfect number. If the
number is perfect, display “It is a perfect number.”; otherwise, display “It is not a perfect number.” */

package loops;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;
        int total = 0;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            for (int i = 1; i < userNumber; i++) {
                if (userNumber % i == 0) {
                    total += i;
                }
            }

            if (total == userNumber) {
                System.out.println("\n" + userNumber + " Is A Perfect Number.");
            } else {
                System.out.println("\n" + userNumber + " Is Not A Perfect Number.");
            }

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}