/* Write a program that sorts three entered numbers in descending order. Write a program that sorts three
entered numbers in ascending order. */

package conditionalstatements;

import java.util.Scanner;

public class SortingNumbersProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int number1;
        int number2;
        int number3;

        System.out.print("\nEnter The First Number : ");
        number1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        number2 = input.nextInt();
        System.out.print("Enter The Third Number : ");
        number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.print("\n" + number1 + " > " + number2 + " > " + number3 + "\n");
            } else {
                System.out.print("\n" + number1 + " > " + number3 + " > " + number2 + "\n");
            }
        } else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                System.out.print("\n" + number2 + " > " + number1 + " > " + number3 + "\n");
            } else {
                System.out.print("\n" + number2 + " > " + number3 + " > " + number1 + "\n");
            }
        } else {
            if (number1 > number2) {
                System.out.print("\n" + number3 + " > " + number1 + " > " + number2 + "\n");
            } else {
                System.out.print("\n" + number3 + " > " + number2 + " > " + number1 + "\n");
            }
        } */

        int number1;
        int number2;
        int number3;

        System.out.print("\nEnter The First Number : ");
        number1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        number2 = input.nextInt();
        System.out.print("Enter The Third Number : ");
        number3 = input.nextInt();

        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.print("\n" + number1 + " < " + number2 + " < " + number3 + "\n");
            } else {
                System.out.print("\n" + number1 + " < " + number3 + " < " + number2 + "\n");
            }
        } else if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.print("\n" + number2 + " < " + number1 + " < " + number3 + "\n");
            } else {
                System.out.print("\n" + number2 + " < " + number3 + " < " + number1 + "\n");
            }
        } else {
            if (number1 < number2) {
                System.out.print("\n" + number3 + " < " + number1 + " < " + number2 + "\n");
            } else {
                System.out.print("\n" + number3 + " < " + number2 + " < " + number1 + "\n");
            }
        }

    }
}