import java.util.Scanner;
public class BankApp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank();
        bank.addAccount(new BankAccount(101,"Ramesh",80000));
        bank.addAccount(new BankAccount(102,"Suresh",50000));
        try{
            System.out.println("Enter sender Account Number: ");
            int sender=sc.nextInt();
            System.out.println("Enter receiver Account Number: ");
            int receiver=sc.nextInt();
            System .out.println("Enter amount to transfer: ");
            double amount=sc.nextDouble();
            BankAccount senderObj=bank.searchAccount(sender);
            BankAccount receiverObj=bank.searchAccount(receiver);
            senderObj.transfer(receiverObj,amount);
            senderObj.display();
            receiverObj.display();
        }
        catch(InvalidAmountException am){
            System.err.println(am.getMessage());
        }
        catch(InsufficientBalanceException in){
            System.err.println(in.getMessage());
        }
        catch(InvalidAccountException ina){
            System.err.println(ina.getMessage());
        }
        catch(DailyLimitExceededException d){
            System.err.println(d.getMessage());
        }
    }
}