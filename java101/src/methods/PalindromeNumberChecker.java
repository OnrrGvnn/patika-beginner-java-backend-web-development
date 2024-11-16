// We are creating a program in Java to determine whether a number is a "Palindrome Number" or not.

package methods;

import java.util.Scanner;

public class PalindromeNumberChecker {
    public static boolean isPalindrome(int number) {
        int tempNumber;
        int lastNumber;
        int reverseNumber = 0;

        tempNumber = number;

        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }

        return number == reverseNumber;

    }

//        private static boolean isPalindrome(String number) {
//
//        for (int i = 0; i < number.length() / 2; i++) {
//            char firstIndex = number.charAt(i);
//            char lastIndex = number.charAt(number.length() - (i + 1));
//
//            if (firstIndex != lastIndex) {
//                return false;
//            }
//
//        }
//
//        return true;
//
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("\nPlease Enter A Number : ");
        number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println("\n" + number + " Is A Palindrome Number.");
        } else {
            System.out.println("\n" + number + " Is Not A Palindrome Number.");
        }

//        String number;

//        System.out.print("\nPlease Enter A Number : ");
//        number = input.nextLine();

//        if (isPalindrome(String.valueOf(number))) {
//            System.out.println("\n" + number + " Is A Palindrome Number.");
//        } else {
//            System.out.println("\n" + number + " Is Not A Palindrome Number.");
//        }

    }

}