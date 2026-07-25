import java.util.Scanner;
public class Task4{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int balance = 5000;
        System.out.println("ATM Menu: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("Enter your choice : ");
        int choice = Sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Your current balance is: " + balance);
                break;
            case 2:
                System.out.println("Enter amount to deposit: ");
                int deposit = Sc.nextInt();
                balance += deposit;
                System.out.println("Deposit successful. New balance is: " + balance);
                break;
            case 3:
                System.out.println("Enter amount to withdraw: ");
                int withdraw = Sc.nextInt();
                if(withdraw <= balance){
                    balance -= withdraw;
                    System.out.println("Withdrawal successful. New balance is: " + balance);
                } else {
                    System.out.println("Insufficient funds. Your current balance is: " + balance);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option from the menu.");
        }
    }
}