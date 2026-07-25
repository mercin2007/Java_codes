class StudentDetails {
    private String name;
    private int rollNo;
    private String dept;
    private double cgpa;

    void setName(String name) {
        this.name = name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setDept(String dept) {
        this.dept = dept;
    }

    void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Setting CGPA to 0.");
            this.cgpa = 0;
        }
    }

    String getName() {
        return name;
    }

    int getRollNo() {
        return rollNo;
    }

    String getDept() {
        return dept;
    }

    double getCgpa() {
        return cgpa;
    }
}

public class FALL3 {
    static void main(String[] args) {

        StudentDetails s = new StudentDetails();

        s.setName("MERCIN");
        s.setRollNo(54);
        s.setDept("CSE");
        s.setCgpa(8.2);

        System.out.println("Student Details");
        System.out.println("Name : " + s.getName());
        System.out.println("Roll No : " + s.getRollNo());
        System.out.println("Department : " + s.getDept());
        System.out.println("CGPA : " + s.getCgpa());
    }
}
