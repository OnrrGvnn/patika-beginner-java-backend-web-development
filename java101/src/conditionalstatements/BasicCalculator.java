// Write a simple calculator program in Java that performs addition, subtraction, multiplication, and division.

package conditionalstatements;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* double number1;
        double number2;
        int select;

        System.out.print("\nPlease Enter The First Number : ");
        number1 = input.nextDouble();
        System.out.print("Please Enter The Second Number : ");
        number2 = input.nextDouble();

        System.out.print("\n1-Addition \n2-Subtraction \n3-Multiplication \n4-Division\n");
        System.out.print("\nPlease Make Your Selection : ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("\nResult Of The Addition Operation : " + (number1 + number2));
        } else if (select == 2) {
            System.out.println("\nResult Of The Subtraction Operation : " + (number1 - number2));
        } else if (select == 3) {
            System.out.println("\nResult Of The Multiplication Operation : " + (number1 * number2));
        } else if (select == 4) {
            if (number2 != 0) {
                System.out.println("\nResult Of The Division Operation : " + (number1 / number2));
            } else {
                System.out.println("\nA Number Cannot Be Divided By Zero. Please Try Again !");
            }
        } else {
            System.out.println("\nPlease! Choose A Number Between 1 And 4.");
        } */

        double number1;
        double number2;
        int select;

        System.out.print("\nPlease Enter The First Number : ");
        number1 = input.nextDouble();
        System.out.print("Please Enter The Second Number : ");
        number2 = input.nextDouble();

        System.out.print("\n1-Addition \n2-Subtraction \n3-Multiplication \n4-Division\n");
        System.out.print("\nPlease Make Your Selection : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("\nResult Of The Addition Operation : " + (number1 + number2));
                break;
            case 2:
                System.out.println("\nResult Of The Subtraction Operation : " + (number1 - number2));
                break;
            case 3:
                System.out.println("\nResult Of The Multiplication Operation : " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("\nResult Of The Division Operation : " + (number1 / number2));
                } else {
                    System.out.println("\nA Number Cannot Be Divided By Zero. Please Try Again !");
                }
                break;
            default:
                System.out.println("\nPlease Choose A Number Between 1 And 4!");
        }

    }
}