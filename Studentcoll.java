import java.util.HashMap;

public class Studentcoll {

    static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Mercin");
        students.put(102, "Aassik");
        students.put(103, "asin");
        System.out.println("Student Details:");
        for (Integer rollNo : students.keySet()) {
            System.out.println("Roll No: " + rollNo + ", Name: " + students.get(rollNo));
        }
        int searchRollNo = 102;
        if (students.containsKey(searchRollNo)) {
            System.out.println("\nStudent Found: " + students.get(searchRollNo));
        } else {
            System.out.println("\nStudent Not Found");
        }
        students.remove(103);

        System.out.println("\nAfter Removing Student:");
        System.out.println(students);
    }
}
