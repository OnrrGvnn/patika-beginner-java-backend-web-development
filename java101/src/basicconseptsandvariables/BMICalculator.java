/* Using Java, take the height and weight values from the user and assign them to variables. Calculate
the user's "Body Mass Index" (BMI) using the formula below and print the result on the screen. */

package basicconseptsandvariables;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height;
        double weight;
        double bmi;

        System.out.print("\nPlease Enter Your Height (in meters) : ");
        height = input.nextDouble();
        System.out.print("Please Enter Your Weight (in kg) : ");
        weight = input.nextDouble();

        bmi = (weight / (height * height));

        System.out.println("\nYour Body Mass Index : " + bmi);

    }
}