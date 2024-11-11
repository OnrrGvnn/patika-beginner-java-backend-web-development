/* Write a Java program to find the GCD (Greatest Common Divisor) and LCM (Least Common Multiple) of two numbers
using a while loop. */

package loops;

import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int userNumber1;
        int userNumber2;
        int gcdResult = 1;
        int lcmResult = 1;

        System.out.print("\nEnter The First Number : ");
        userNumber1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        userNumber2 = input.nextInt();

        if ((userNumber1 > 0) && (userNumber2 > 0)) {
            if (userNumber1 >= userNumber2) {
                for (int i = 1; i <= userNumber2; i++) {
                    if ((userNumber1 % i == 0) && (userNumber2 % i == 0)) {
                        gcdResult = i;
                    }
                }

            } else {
                for (int i = 1; i <= userNumber1; i++) {
                    if ((userNumber2 % i == 0) && (userNumber1 % i == 0)) {
                        gcdResult = i;
                    }
                }

            }

            System.out.println("\nGCD Of " + userNumber1 + " And " + userNumber2 + " Is : " + gcdResult);

            for (int i = 1; i <= (userNumber1 * userNumber2); i++) {
                if ((i % userNumber1 == 0) && (i % userNumber2 == 0)) {
                    lcmResult = i;
                    System.out.println("LCM Of " + userNumber1 + " And " + userNumber2 + " Is : " + lcmResult);

                    break;
                }

            }

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } */

        int userNumber1;
        int userNumber2;
        int i = 1;
        int gcdResult = 1;
        int lcmResult = 1;


        System.out.print("\nEnter The First Number : ");
        userNumber1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        userNumber2 = input.nextInt();

        if ((userNumber1 > 0) && (userNumber2 > 0)) {
            if (userNumber1 >= userNumber2) {
                while (i <= userNumber2) {
                    if ((userNumber1 % i == 0) && (userNumber2 % i == 0)) {
                        gcdResult = i;
                    }

                    i++;

                }
            } else {
                while (i <= userNumber1) {
                    if ((userNumber1 % i == 0) && (userNumber2 % i == 0)) {
                        gcdResult = i;
                    }

                    i++;

                }
            }

            System.out.println("\nGCD Of " + userNumber1 + " And " + userNumber2 + " Is : " + gcdResult);

            while (i <= (userNumber1 * userNumber2)) {
                if ((i % userNumber1 == 0) && (i % userNumber2 == 0)) {
                    lcmResult = i;
                    System.out.println("LCM Of " + userNumber1 + " And " + userNumber2 + " Is : " + lcmResult);
                    break;
                }

                i++;

            }

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }
}