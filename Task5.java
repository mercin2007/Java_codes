import java.util.Scanner;
public class Task5{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Traffic Light: ");
        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green");
        System.out.println("Enter your choice : ");
        int choice = Sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Get Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option from the menu.");
        }
    }
}