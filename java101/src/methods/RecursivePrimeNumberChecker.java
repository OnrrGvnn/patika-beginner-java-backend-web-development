// Write a program in Java that determines whether a number entered by the user is a "Prime" number using a "Recursive" method.

package methods;

import java.util.Scanner;

public class RecursivePrimeNumberChecker {
    public static boolean isPrime(int n, int d) {
        if (d == 1) {
            return true;
        }

        if (n % d == 0) {
            return false;
        }

        return isPrime(n, d - 1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        if (userNumber <= 1) {
            System.out.println("\nInvalid Entry: The Number Must Be Greater Than 1.");
            return;
        }

        if (isPrime(userNumber, (userNumber / 2))) {
            System.out.println("\n" + userNumber + " Is A Prime Number.");
        } else {
            System.out.println("\n" + userNumber + " Is Not A Prime Number.");
        }

    }

}