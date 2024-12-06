/* Write a program using multidimensional arrays to print the letter "A" on the screen with "stars". Write a program
using multidimensional arrays to print the letter "B" on the screen with "stars". */

package arrays;

public class LetterPatternDrawer {
    public static void main(String[] args) {
        /* String[][] letters = new String[6][4];

        System.out.println();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                if (i == 0 || i == 2) {
                    letters[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letters[i][j] = " * ";
                } else {
                    letters[i][j] = "   ";
                }

            }

        }

        for (String[] row : letters) {
            for (String col : row) {
                System.out.print(col);
            }

            System.out.println();

        } */

        String[][] letters = new String[7][4];

        System.out.println();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    if (j == 3) {
                        letters[i][j] = "   ";
                    } else {
                        letters[i][j] = " * ";
                    }
                } else if (j == 0 || j == 3) {
                    letters[i][j] = " * ";
                } else {
                    letters[i][j] = "   ";
                }

            }

        }

        for (String[] row : letters) {
            for (String col : row) {
                System.out.print(col);
            }

            System.out.println();

        }

    }

}