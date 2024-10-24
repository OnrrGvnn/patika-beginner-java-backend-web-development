/* Write a Java program that takes exam scores of Mathematics, Physics, Chemistry, Turkish, History, and Music courses
 from the user and calculates their average. Use conditional statements in the same program to print "Passed the Class"
 if the user's average is greater than 60, and "Failed the Class" if it is less than 60. */

package basicconseptsandvariables;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mathematics;
        int physics;
        int chemistry;
        int turkish;
        int history;
        int music;
        double avg;
        String pass;

        System.out.print("\nPlease Enter The Math Grade : ");
        mathematics = input.nextInt();
        System.out.print("Please Enter The Physics Grade : ");
        physics = input.nextInt();
        System.out.print("Please Enter The Chemistry Grade : ");
        chemistry = input.nextInt();
        System.out.print("Please Enter The Turkish Grade : ");
        turkish = input.nextInt();
        System.out.print("Please Enter The History Grade : ");
        history = input.nextInt();
        System.out.print("Please Enter The Music Grade : ");
        music = input.nextInt();

        avg = (double) (mathematics + physics + chemistry + turkish + history + music) / 6;
        System.out.println("\nAverage : " + avg);

        pass = avg >= 60 ? "Congratulations! You Have Passed The Class." : "We're Sorry. You Have Failed The Class.";
        System.out.println(pass);

    }
}