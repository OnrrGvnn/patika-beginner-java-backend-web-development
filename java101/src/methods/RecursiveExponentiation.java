/* Write a program in Java that performs exponentiation using a "Recursive" method, where the base and exponent
values are obtained from the user. */

package methods;

import java.util.Scanner;

public class RecursiveExponentiation {
    private static double calculateExponentiation(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * calculateExponentiation(base, (exponent - 1));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base;
        int exponent;
        double result;

        System.out.print("\nEnter The Base Value : ");
        base = input.nextInt();
        System.out.print("Enter The Exponent Value : ");
        exponent = input.nextInt();

        if (base == 0 && exponent == 0) {
            System.out.println("\n0 Raised To The Power Of 0 Is Considered An Indeterminate Form.");
            return;
        }

        result = calculateExponentiation(base, Math.abs(exponent));

        if (exponent < 0) {
            result = 1 / result;
        }

        System.out.println("\nResult : " + result);

    }

}