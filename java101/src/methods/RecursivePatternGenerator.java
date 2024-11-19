/* Write a program in Java that uses a "Recursive" method without using loops, based on the following rule, for a value
of n entered by the user:

Rule: Subtract 5 from the entered number repeatedly until the number becomes 0 or negative. Print the value after each
subtraction. Once the number becomes 0 or negative, add 5 back repeatedly, printing the value after each addition,
until the original number is reached. */

package methods;

import java.util.Scanner;

public class RecursivePatternGenerator {
    private static void generatePattern(int n) {
        System.out.print(n + " ");

        if (n > 0) {
            generatePattern(n - 5);
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        System.out.println();

        if (userNumber > 0) {
            generatePattern(userNumber);
            System.out.println();
        } else {
            System.out.println("Invalid Entry: The number must be greater than 0.");
        }

    }

}