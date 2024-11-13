// Write a program in Java that prints all prime numbers between 1 and 100.

package loops;

public class PrimeNumberPrinter {
    public static void main(String[] args) {

        System.out.println("\nPrime Numbers Between 1 And 100 :\n");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

    }
}