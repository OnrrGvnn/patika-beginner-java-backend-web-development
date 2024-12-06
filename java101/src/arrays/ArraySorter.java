/* Write a program in Java that sorts the elements of an array from smallest to largest. Take the size of the array
and the elements of the array from the user. */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;

        System.out.print("\nPlease Enter The Number Of Elements In The Array : ");
        size = input.nextInt();

        int[] array = new int[size];

        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print("Please Enter " + (i + 1) + ". Element Of The Array : ");
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        System.out.println("\nSorted Array : " + Arrays.toString(array));

    }

}