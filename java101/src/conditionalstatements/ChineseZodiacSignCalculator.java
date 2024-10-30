/* Write a Java program that takes the user's birth year and calculates their Chinese Zodiac sign. */

package conditionalstatements;

import java.util.Scanner;

public class ChineseZodiacSignCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        int chineseZodiac;
        String chineseZodiacSign = "";
        boolean isError = false;

        System.out.print("\nPlease Enter Your Birth Year: ");
        year = input.nextInt();

        chineseZodiac = year % 12;

        if (year > 0) {
            switch (chineseZodiac) {
                case 0:
                    chineseZodiacSign = "Monkey";
                    break;
                case 1:
                    chineseZodiacSign = "Rooster";
                    break;
                case 2:
                    chineseZodiacSign = "Dog";
                    break;
                case 3:
                    chineseZodiacSign = "Pig";
                    break;
                case 4:
                    chineseZodiacSign = "Mouse";
                    break;
                case 5:
                    chineseZodiacSign = "Ox";
                    break;
                case 6:
                    chineseZodiacSign = "Tiger";
                    break;
                case 7:
                    chineseZodiacSign = "Rabbit";
                    break;
                case 8:
                    chineseZodiacSign = "Dragon";
                    break;
                case 9:
                    chineseZodiacSign = "Snake";
                    break;
                case 10:
                    chineseZodiacSign = "Horse";
                    break;
                case 11:
                    chineseZodiacSign = "Goat";
                    break;
                default:
                    isError = true;
                    break;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } else {
            System.out.println("\nYour Chinese Zodiac Sign: " + chineseZodiacSign);
        }

    }
}