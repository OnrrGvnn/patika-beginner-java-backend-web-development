// We are creating a calculator in Java that performs operations selected by the user.

package methods;

import java.util.Scanner;

public class AdvancedCalculator {
    private static Scanner getScanner() {
        return new Scanner(System.in);
    }

    private static void addition(Scanner input) {
        int count;
        double userNumber;
        double result = 0.0;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();

        if (count <= 1) {
            System.out.println("\nYou Must Enter A Minimum Of 2 Numbers!");
            return;
        }

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Number : ");
            userNumber = input.nextDouble();

            result += userNumber;

        }

        System.out.println("\nResult : " + result);

    }

    private static void subtraction(Scanner input) {
        int count;
        double userNumber;
        double result;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();

        if (count <= 1) {
            System.out.println("\nYou Must Enter A Minimum Of 2 Numbers!");
            return;
        }

        System.out.print("1. Number : ");
        result = input.nextDouble();

        for (int i = 2; i <= count; i++) {
            System.out.print(i + ". Number : ");
            userNumber = input.nextDouble();

            result -= userNumber;

        }

        System.out.println("\nResult : " + result);

    }

    private static void multiplication(Scanner input) {
        int count;
        double userNumber;
        double result = 1.0;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();

        if (count <= 1) {
            System.out.println("\nYou Must Enter A Minimum Of 2 Numbers!");
            return;
        }

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Number : ");
            userNumber = input.nextDouble();

            result *= userNumber;

        }

        System.out.println("\nResult : " + result);

    }

    private static void division(Scanner input) {
        int count;
        double userNumber;
        double result;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();

        if (count <= 1) {
            System.out.println("\nYou Must Enter A Minimum Of 2 Numbers!");
            return;
        }

        System.out.print("1. Number : ");
        result = input.nextDouble();

        for (int i = 2; i <= count; i++) {
            System.out.print(i + ". Number : ");
            userNumber = input.nextDouble();

            if (userNumber == 0) {
                System.out.println("\nYou Cannot Enter 0 As The Divisor!");
                return;
            }

            result /= userNumber;

        }

        System.out.println("\nResult : " + result);

    }

    private static void exponentiation(Scanner input) {
        int base;
        int exponent;
        double result = 1.0;

        System.out.print("\nEnter The Base Value : ");
        base = input.nextInt();
        System.out.print("Enter The Exponent Value : ");
        exponent = input.nextInt();

        if (base == 0 && exponent == 0) {
            System.out.println("\n0 Raised To The Power Of 0 Is Considered An Indeterminate Form.");
            return;
        }

        for (int i = 1; i <= Math.abs(exponent); i++) {
            result *= base;
        }

        if (exponent < 0) {
            result = 1.0 / result;
        }

        System.out.println("\nResult : " + result);

    }

    private static void factorialCalculation(Scanner input) {
        int userNumber;
        int result = 1;

        System.out.print("\nEnter The Number For Which You Want To Calculate The Factorial : ");
        userNumber = input.nextInt();

        if (userNumber < 0) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
            return;
        }

        for (int i = 1; i <= userNumber; i++) {
            result *= i;
        }

        System.out.println("\nResult : " + result);

    }

    private static void modulo(Scanner input) {
        int userNumber1;
        int userNumber2;
        int result;

        System.out.print("\nEnter The First Number : ");
        userNumber1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        userNumber2 = input.nextInt();

        if (userNumber1 <= 0 || userNumber2 <= 0) {
            System.out.println("\nInvalid Entry: Numbers Must Be Positive Integers.");
            return;
        }

        result = userNumber1 % userNumber2;

        System.out.println("\nResult : " + result);

    }

    private static void calculateRectangleAreaAndPerimeter(Scanner input) {
        double shortSide;
        double longSide;
        double area;
        double perimeter;

        System.out.print("\nEnter The Short Side Of The Rectangle: : ");
        shortSide = input.nextDouble();
        System.out.print("Enter The Long Side Of The Rectangle : ");
        longSide = input.nextDouble();

        if (shortSide <= 0 || longSide <= 0) {
            System.out.println("\nInvalid Entry: Both Sides Must Be Positive Numbers.");
            return;
        }

        area = shortSide * longSide;
        perimeter = 2 * (shortSide + longSide);

        System.out.println("\nArea : " + area);
        System.out.println("Perimeter : " + perimeter);

    }

    public static void main(String[] args) {
        Scanner input = getScanner();

        int select;

        System.out.println("\nHello. Here Are The Types Of Operations You Can Perform : ");

        while (true) {
            System.out.print("""
                    \n1-Addition Operation\s
                    2-Subtraction Operation\s
                    3-Multiplication Operation\s
                    4-Division Operation\s
                    5-Exponentiation\s
                    6-Factorial Calculation\s
                    7-Modulo\s
                    8-Rectangle Area and Perimeter Calculation\s
                    0-Exit
                    """);

            System.out.print("\nYour Choice : ");
            select = input.nextInt();

            if (select == 0) {
                System.out.println("\nGood Bye !");
                break;
            }

            switch (select) {
                case 1:
                    addition(input);
                    break;
                case 2:
                    subtraction(input);
                    break;
                case 3:
                    multiplication(input);
                    break;
                case 4:
                    division(input);
                    break;
                case 5:
                    exponentiation(input);
                    break;
                case 6:
                    factorialCalculation(input);
                    break;
                case 7:
                    modulo(input);
                    break;
                case 8:
                    calculateRectangleAreaAndPerimeter(input);
                    break;
                default:
                    System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
                    break;
            }

        }

    }

}