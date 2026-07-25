import java.util.Scanner;

class Stud_1 {
    String name;
    int rollnumber;

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Stud roll number: " + rollnumber);
    }
}

public class Student_1 {
    static void main(String[] args) {
        Stud_1 s1 = new Stud_1();
        s1.name = "mercin";
        s1.rollnumber = 54;
        s1.display();
    }
}