/* Write a Java Program to Calculate the Average of Elements in an Array. Write a Program to Calculate the Harmonic
Mean of Numbers in an Array. */

package arrays;

public class ArrayMeanCalculator {
    public static void main(String[] args) {
        /* int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        double average;

        for (int number : list) {
            sum += number;
        }

        average = (double) sum / list.length;
        System.out.println("\nAverage : " + average); */

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double harmonicMean;

        for (int number : list) {
            sum += 1.0 / number;
        }

        harmonicMean = sum / list.length;
        System.out.println("\nHarmonic Mean : " + harmonicMean);

    }

}