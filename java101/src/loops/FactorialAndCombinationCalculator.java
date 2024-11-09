/* We are writing a Java program that calculates the factorial of a number. Write a Java program that calculates
the combination of two numbers.*/

package loops;

import java.util.Scanner;

public class FactorialAndCombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int userNumber;
        int total = 1;

        System.out.print("\nEnter The Number For Which You Want To Calculate The Factorial : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            for (int i = 1; i <= userNumber; i++) {
                total *= i;
            }

            System.out.println("\n" + userNumber + "! = " + total);

        } else if (userNumber == 0) {
            System.out.println("\n0! = 1");
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }*/

        int n;
        int r;
        int combination;
        int nTotal = 1;
        int rTotal = 1;
        int mixTotal = 1;

        System.out.print("\nEnter The Value Of n : ");
        n = input.nextInt();
        System.out.print("Enter The Value Of r : ");
        r = input.nextInt();

        if ((n >= 0) && (r >= 0)) {
            if (n >= r) {
                for (int i = 1; i <= n; i++) {
                    nTotal *= i;
                }

                for (int i = 1; i <= r; i++) {
                    rTotal *= i;
                }

                for (int i = 1; i <= (n - r); i++) {
                    mixTotal *= i;
                }

                combination = (nTotal / (rTotal * mixTotal));
                System.out.println("\nC(" + n + "," + r + ") = " + combination);

            } else {
                System.out.println("\nError! n Should Be Greater Than Or Equal To r.");
            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}