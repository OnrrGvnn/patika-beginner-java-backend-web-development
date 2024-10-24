/* Write a Java program that takes exam scores of Mathematics, Physics, Chemistry, Turkish, History, and Music courses
 from the user and calculates their average. Use conditional statements in the same program to print "Passed the Class"
 if the user's average is greater than 60, and "Failed the Class" if it is less than 60. */

package basicconseptsandvariables;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mathGrade;
        int physicGrade;
        int chemistryGrade;
        int turkishGrade;
        int historyGrade;
        int musicGrade;
        double averageGrade;
        String pass;

        System.out.print("\nPlease Enter The Math Grade : ");
        mathGrade = input.nextInt();
        System.out.print("Please Enter The Physics Grade : ");
        physicGrade = input.nextInt();
        System.out.print("Please Enter The Chemistry Grade : ");
        chemistryGrade = input.nextInt();
        System.out.print("Please Enter The Turkish Grade : ");
        turkishGrade = input.nextInt();
        System.out.print("Please Enter The History Grade : ");
        historyGrade = input.nextInt();
        System.out.print("Please Enter The Music Grade : ");
        musicGrade = input.nextInt();

        averageGrade = (double) (mathGrade + physicGrade + chemistryGrade + turkishGrade + historyGrade + musicGrade) / 6;
        System.out.println("\nAverage : " + averageGrade);

        pass = averageGrade >= 60 ? "Congratulations! You Have Passed The Class." : "We're Sorry. You Have Failed The Class.";
        System.out.println(pass);

    }
}