/* Write a Java Program to Calculate the Average of Elements in an Array. Write a Program to Calculate the Harmonic
Mean of Numbers in an Array. */

package arrays;

public class ArrayMeanCalculator {
    public static void main(String[] args) {
        /* int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        double average;

        for (int i : numbers) {
            sum += i;
        }

        average = (double) sum / numbers.length;
        System.out.println("\nAverage : " + average);*/

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double harmonicMean;

        for (double i : numbers) {
            sum += 1 / i;
        }

        harmonicMean = sum / numbers.length;
        System.out.println("\nHarmonic Mean : " + harmonicMean);

    }

}