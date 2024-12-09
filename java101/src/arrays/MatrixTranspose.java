/* Write a program in Java to find the transpose of a matrix using multidimensional arrays. */

package arrays;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows;
        int columns;
        int[][] matrix;
        int[][] transposedMatrix;

        System.out.print("\nEnter The Number Of Rows : ");
        rows = input.nextInt();

        System.out.print("Enter The Number Of Columns : ");
        columns = input.nextInt();

        matrix = new int[rows][columns];

        System.out.println("\nEnter The Elements Of The Matrix : \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }

        }

        transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }

        }

        System.out.println("\nOriginal Matrix : \n");

        for (int[] i : matrix) {
            for (int element : i) {
                System.out.print(element + " ");
            }

            System.out.println();

        }

        System.out.println("\nTranspose of the Matrix : \n");

        for (int[] i : transposedMatrix) {
            for (int element : i) {
                System.out.print(element + " ");
            }

            System.out.println();

        }

    }

}