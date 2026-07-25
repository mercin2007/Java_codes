import java.util.ArrayList;
import java.util.Scanner;


public class List7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> contacts = new ArrayList<>();
        int choice;
        System.out.println(" Contact Management System");
        do {
            System.out.println("1.Add Contact ");
            System.out.println("2.Search Contact" + " ");
            System.out.println("3.Remove Contact \n");
            System.out.print("4.Display Contact \n");
            System.out.print("5.Exit \n");
            System.out.print("Enter your choice:\n\t ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Contact Name: ");
                    String name = sc.nextLine();
                    System.out.print(" Contact Added succefully: ");
                    break;
                case 2:
                    System.out.print("Enter Contact search: ");
                    String search = sc.nextLine();
                    if (contacts.contains(search))
                        System.out.println("Contact found");
                    else ;
                    System.out.println("Contact not found");
                    break;
                case 3:
                    System.out.print("Enter Contact name to remove : ");
                    String remove = sc.nextLine();
                    if (contacts.remove(remove))
                        System.out.println("Contact removed");
                    else ;
                    System.out.println("Contact not removed");
                    break;
                case 4:
                    System.out.print("\n contact list : ");
                    for (String contact : contacts) {
                        System.out.println(contacts);
                    }
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
