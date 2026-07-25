import java.util.Scanner;
public class Task3{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Food Menu: ");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Salad");
        System.out.println("Enter your choice : ");
        int choice = Sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("You have selected Pizza.");
                break;
            case 2:
                System.out.println("You have selected Burger.");
                break;
            case 3:
                System.out.println("You have selected Pasta.");
                break;
            case 4:
                System.out.println("You have selected Salad.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option from the menu.");
        }
    }
}