/* Write a Java program that reads N positive integers from the keyboard, finds the largest and smallest numbers
among them, and displays these numbers on the screen. */

package loops;

import java.util.Scanner;

public class MaxMinNumbersFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count;
        int number;
        int max = 0;
        int min = 0;

        System.out.print("\nHow Many Numbers Will You Enter? : ");
        count = input.nextInt();

        System.out.println();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Number : ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("\nThe Largest Of The Entered Numbers : " + max);
        System.out.println("The Smallest Of The Entered Numbers : " + min);

    }
}