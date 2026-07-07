package banking.app;

import banking.exception.*;
import java.util.Scanner;
class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        bank.addAccount(new BankAccount(101, "Ramesh", 80000));
        bank.addAccount(new BankAccount(102, "Suresh", 50000));

        try {

            System.out.print("Enter Sender Account Number : ");
            int sender = sc.nextInt();

            System.out.print("Enter Receiver Account Number : ");
            int receiver = sc.nextInt();

            System.out.print("Enter Amount : ");
            double amount = sc.nextDouble();

            BankAccount senderObj = bank.searchAccount(sender);
            BankAccount receiverObj = bank.searchAccount(receiver);

            senderObj.transfer(receiverObj, amount);

            System.out.println("\nSender Details");
            senderObj.display();

            System.out.println("\nReceiver Details");
            receiverObj.display();

        }

        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        catch (InvalidAccountException e) {
            System.out.println(e.getMessage());
        }

        catch (DailyLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}