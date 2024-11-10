// We are going to write a Java program that calculates the harmonic series of an entered number.

package loops;

import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;
        double result = 0;

        System.out.print("\nPlease Enter The Value Of n To Calculate The Harmonic Series : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            for (double i = 1; i <= userNumber; i++) {
                result += (1 / i);
            }

            System.out.println("\nResult Of The Harmonic Series : " + result);

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}