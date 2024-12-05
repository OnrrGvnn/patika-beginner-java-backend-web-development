/* We are writing a program in Java to find the maximum and minimum values in an array. Write a program to find the
closest smaller and closest larger numbers to a given value in an array. */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClosestAndExtremeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int[] list = {5, 4, 633, 441, 3, 66, -9, -77, 15};
        int min;
        int max;

        min = list[0];
        max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }

        }

        System.out.println("\nMin Value : " + min);
        System.out.println("Max Value : " + max); */

        int[] list = {1, 2, 3, 5, 6, 7};
        int closestSmaller;
        int closestLarger;
        int userNumber;

        closestSmaller = list[0];
        closestLarger = list[0];

        Arrays.sort(list);

        for (int i : list) {
            if (i < closestSmaller) {
                closestSmaller = i;
            }

            if (i > closestLarger) {
                closestLarger = i;
            }

        }

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        for (int i : list) {
            if (i < userNumber && i > closestSmaller) {
                closestSmaller = i;
            }

            if (i > userNumber && i < closestLarger) {
                closestLarger = i;
            }

        }

        System.out.println("\nClosest Number Smaller Than The " + userNumber + " : " + closestSmaller);
        System.out.println("Closest Number Larger Than The " + userNumber + " : " + closestLarger);

    }

}