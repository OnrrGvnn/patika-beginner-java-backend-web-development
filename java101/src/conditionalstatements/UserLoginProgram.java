/* Write a program that, if the password is incorrect, asks the user if they would like to reset it. If the user
chooses to reset, the program should ensure that the new password entered is different from the forgotten password.
If the passwords are the same, display 'Password could not be created, please enter a different password.'
Otherwise, display 'Password created successfully.' */

package conditionalstatements;

import java.util.Scanner;

public class UserLoginProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username;
        String password;
        String select;

        System.out.print("\nPlease Enter Your Username : ");
        username = input.nextLine();
        System.out.print("Please Enter Your Password : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("\nLogged In!");
        } else {
            System.out.println("\nUsername Or Password Is Incorrect!");
            System.out.println("\nWould You Like To Reset Your Password?");
            System.out.print("Yes Or No? : ");
            select = input.nextLine();

            switch (select) {
                case "Yes":
                    System.out.print("\nPlease Choose A New Password : ");
                    String newPassword;
                    newPassword = input.nextLine();

                    if (password.equals("java123")) {
                        System.out.println("\nThe New Password Cannot Be The Same As The Previous One!");
                    } else {
                        System.out.println("\nYour New Password Has Been Successfully Created! : " + newPassword);
                    }

                    break;
                case "No":
                    System.out.println("\nYou Are Being Redirected To The Login Page!");
                    break;
            }

        }

    }
}