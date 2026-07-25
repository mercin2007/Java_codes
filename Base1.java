import java.io.*;
import java.util.Scanner;

public class Base1 {
    static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Record");
        System.out.println("2. View Record");
        System.out.println("3. Append Record");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        sc.nextLine();
        if (ch == 1) {
            FileWriter fw = new FileWriter("student.txt");
            System.out.print("Enter Roll No: ");
            String roll = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            fw.write(roll + " " + name + " " + course);
            fw.close();
            System.out.println("Record Added");
        } else if (ch == 2) {
            FileReader fr = new FileReader("student.txt");
            int ch1;
            while ((ch1 = fr.read()) != -1) {
                System.out.print((char) ch1);
            }
            fr.close();
        } else if (ch == 3) {
            FileWriter fw = new FileWriter("student.txt", true);
            System.out.print("Enter Roll No: ");
            String roll = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            fw.write("\n" + roll + " " + name + " " + course);
            fw.close();
            System.out.println("Record Appended");
        } else {
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}