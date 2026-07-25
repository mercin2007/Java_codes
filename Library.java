import java.util.Scanner;

class LibraryBook {
    int id;
    String title;
    String author;
    boolean isIssued;

    LibraryBook(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void displayBook() {
        System.out.println("\nBook ID    : " + id);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        if (isIssued) {
            System.out.println("Status     : Issued");
        } else {
            System.out.println("Status     : Available");
        }
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }
}

public class Library {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        LibraryBook book = new LibraryBook(id, title, author);
        int choice;
        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. View Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    book.displayBook();
                    break;
                case 2:
                    book.issueBook();
                    break;
                case 3:
                    book.returnBook();
                    break;
                case 4:
                    System.out.println("Thank you for using the Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}

