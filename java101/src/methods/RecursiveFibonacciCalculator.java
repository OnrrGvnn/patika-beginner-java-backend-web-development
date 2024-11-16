// We are creating a program in Java to find the Fibonacci series using recursive methods.

package methods;

import java.util.Scanner;

public class RecursiveFibonacciCalculator {
    public static boolean isValidInput(int n) {
        if (n <= 0) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
            return true;
        }

        return false;

    }

    public static int getFibonacciNumber(int n) {
        if (n <= 2) {
            return n - 1;
        }

        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nEnter The Number Of Elements In The Fibonacci Series : ");
        userNumber = input.nextInt();

        if (isValidInput(userNumber)) {
            return;
        }

        System.out.println();

        for (int i = 1; i <= userNumber; i++) {
            System.out.print(getFibonacciNumber(i) + " ");
        }

        System.out.println();

    }

}