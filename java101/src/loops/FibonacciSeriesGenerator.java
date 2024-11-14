/* Write a program in Java that uses loops to find the Fibonacci sequence. Get the number of elements in
the Fibonacci sequence from the user. */

package loops;

import java.util.Scanner;

public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;
        int number1 = 0;
        int number2 = 1;
        int nextNumber;

        System.out.print("\nEnter The Number Of Elements In The Fibonacci Series : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            if (userNumber == 1) {
                System.out.println("\n" + number1);
            } else if (userNumber == 2) {
                System.out.println("\n" + number1 + " " + number2);
            } else {
                System.out.print("\n" + userNumber + "-Term Fibonacci Series : " + number1 + " " + number2 + " ");

                for (int i = 3; i <= userNumber; i++) {
                    nextNumber = number1 + number2;
                    System.out.print(nextNumber + " ");
                    number1 = number2;
                    number2 = nextNumber;
                }

                System.out.println();

            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}