/* Write a program in Java that determines how many times each element in an array is repeated, i.e , finds
their frequencies. */

package arrays;

public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] list = {5, 5, 9, 10, 12, 14, 5, 14};
        int[] newList = new int[list.length];
        int counter;

        System.out.println("\nElement Frequencies : \n");

        for (int i = 0; i < list.length; i++) {
            if (newList[i] == 1) {
                continue;
            }

            counter = 1;

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    counter++;
                    newList[j] = 1;
                }

            }

            System.out.println(list[i] + " Appears " + counter + " Time.");

        }

    }

}