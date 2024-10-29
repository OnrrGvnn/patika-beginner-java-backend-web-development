/* Write a Java program that takes exam scores of Mathematics, Physics, Chemistry, Turkish and Music courses
 from the user and calculates their average. Use conditional statements in the same program to print "Passed the Class"
 if the user's average is greater than 55, and "Failed the Class" if it is less than 55. If the entered course
 grades are not between 0 and 100, they should not be included in the average calculation. */

package conditionalstatements;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mathGrade;
        int physicGrade;
        int chemistryGrade;
        int turkishGrade;
        int musicGrade;
        int lessonCount = 5;
        double averageGrade;

        System.out.print("\nPlease Enter The Math Grade : ");
        mathGrade = input.nextInt();
        System.out.print("Please Enter The Physics Grade : ");
        physicGrade = input.nextInt();
        System.out.print("Please Enter The Turkish Grade : ");
        turkishGrade = input.nextInt();
        System.out.print("Please Enter The Chemistry Grade : ");
        chemistryGrade = input.nextInt();
        System.out.print("Please Enter The Music Grade : ");
        musicGrade = input.nextInt();

        if (mathGrade < 0 || mathGrade > 100) {
            mathGrade = 0;
            lessonCount--;
        }

        if (physicGrade < 0 || physicGrade > 100) {
            physicGrade = 0;
            lessonCount--;
        }

        if (turkishGrade < 0 || turkishGrade > 100) {
            turkishGrade = 0;
            lessonCount--;
        }

        if (chemistryGrade < 0 || chemistryGrade > 100) {
            chemistryGrade = 0;
            lessonCount--;
        }

        if (musicGrade < 0 || musicGrade > 100) {
            musicGrade = 0;
            lessonCount--;
        }

        if (lessonCount != 0) {
            averageGrade = (double) (mathGrade + physicGrade + turkishGrade + chemistryGrade + musicGrade) / lessonCount;
            System.out.println("\nAverage Grade : " + averageGrade);

            if (averageGrade >= 55) {
                System.out.println("Congratulations! You Have Passed The Class.");
            } else {
                System.out.println("We're Sorry. You Have Failed The Class.");
            }
        } else {
            System.out.println("\nYou Have Entered Invalid Values. Please Try Again Later !");
        }

    }
}