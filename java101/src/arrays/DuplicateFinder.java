/* Write a program to find the duplicate numbers in an array. Write a program to find the duplicate even numbers
in an array. */

package arrays;

public class DuplicateFinder {
    /* public static boolean isAlreadyInArray(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        int[] list = {1, 2, 2, 4, 6, 7, 7, 10};
        int[] duplicate = new int[list.length];
        int counter = 0;

        System.out.println();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isAlreadyInArray(duplicate, list[i])) {
                        duplicate[counter++] = list[i];
                    }

                    break;

                }

            }

        }

        for (int i : duplicate) {
            if (i != 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

    } */

    public static boolean isAlreadyInArray(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        int[] list = {1, 1, 2, 2, 6, 7, 7, 10, 10};
        int[] duplicate = new int[list.length];
        int counter = 0;

        System.out.println();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isAlreadyInArray(duplicate, list[i])) {
                        duplicate[counter++] = list[i];
                    }

                    break;

                }

            }

        }

        for (int i : duplicate) {
            if (i != 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

    }

}