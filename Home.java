import java.util.Scanner;
public class Home {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Choice;
        int balance=1000;
        do{
            System.out.println("Welcome to ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            Choice = sc.nextInt();
            switch( Choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposit successful. New balance: " + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if(withdraw <= balance){
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (Choice != 4);
        sc.close();

    }

}

