// We are creating an ATM project in Java where the user can manage their bank account using loops.

package loops;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* String userName;
        String password;
        int right = 3;
        int select;
        int userMoney;
        int balance = 1500;

        System.out.println("\nWelcome To X Bank!");

        while (right > 0) {
            System.out.print("\nPlease Enter Your Username : ");
            userName = input.nextLine();
            System.out.print("Please Enter Your Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("\nHello Patika !");

                do {
                    System.out.println("\nPlease Select The Action You Want To Perform !");
                    System.out.println("\n1-Deposit Cash \n2-Withdraw Cash \n3-Check Balance \n4-Exit");
                    System.out.print("\nYour Select : ");
                    select = input.nextInt();

                    if (select == 1) {
                        System.out.print("\nEnter Deposit Amount : ");
                        userMoney = input.nextInt();

                        balance += userMoney;
                        System.out.println("\nYour cash has been accepted. Your New Balance = " + balance);

                    } else if (select == 2) {
                        System.out.println("\nYour Balance = " + balance);
                        System.out.print("\nEnter Withdraw Amount : ");
                        userMoney = input.nextInt();

                        if (userMoney > balance) {
                            System.out.println("\nInsufficient Balance!");
                            System.out.println("Your Balance = " + balance);
                        } else {
                            balance -= userMoney;
                            System.out.println("\nPlease Withdraw Your Money From Tray.");
                            System.out.println("Your New Balance = " + balance);
                        }

                    } else if (select == 3) {
                        System.out.println("\nBalance = " + balance);
                    } else if (select <= 0 || select > 4) {
                        System.out.println("\nYou Made An Invalid Entry. Please Try Again!\n");
                    }
                } while (select != 4);

                System.out.println("\nThank You For Using X Bank!");

                break;

            } else {
                right--;

                if (right == 0) {
                    System.out.println("\nYour Account Has Been Blocked. Please Contact Your Bank.");
                } else {
                    System.out.println("\nInvalid Username Or Password. Please Try again !");
                    System.out.println("Your Remaining Attempts: " + right);
                }

            }

        } */

        String userName;
        String password;
        int right = 3;
        int select;
        int userMoney;
        int balance = 1500;

        System.out.println("\nWelcome To X Bank!");

        while (right > 0) {
            System.out.print("\nPlease Enter Your Username : ");
            userName = input.nextLine();
            System.out.print("Please Enter Your Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("\nHello Patika !");

                do {
                    System.out.println("\nPlease Select The Action You Want To Perform !");
                    System.out.println("\n1-Deposit Cash \n2-Withdraw Cash \n3-Check Balance \n4-Exit");
                    System.out.print("\nYour Select : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("\nEnter Deposit Amount : ");
                            userMoney = input.nextInt();

                            balance += userMoney;
                            System.out.println("\nYour cash has been accepted. Your New Balance = " + balance);

                            break;
                        case 2:
                            System.out.println("\nYour Balance = " + balance);
                            System.out.print("\nEnter Withdraw Amount : ");
                            userMoney = input.nextInt();

                            if (userMoney > balance) {
                                System.out.println("\nInsufficient Balance!");
                                System.out.println("Your Balance = " + balance);
                            } else {
                                balance -= userMoney;
                                System.out.println("\nPlease Withdraw Your Money From Tray.");
                                System.out.println("Your New Balance = " + balance);
                            }

                            break;
                        case 3:
                            System.out.println("\nBalance = " + balance);

                            break;
                        case 4:
                            System.out.println("\nThank You For Using X Bank!");

                            break;
                        default:
                            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");

                            break;
                    }


                } while (select != 4);

                break;

            } else {
                right--;

                if (right == 0) {
                    System.out.println("\nYour Account Has Been Blocked. Please Contact Your Bank.");
                } else {
                    System.out.println("\nInvalid Username Or Password. Please Try again !");
                    System.out.println("Your Remaining Attempts: " + right);
                }

            }

        }

    }
}