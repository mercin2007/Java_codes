class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(int empId, String name, double salary, String department) {
        super(empId, name, salary);
        this.department = department;
    }

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(int empId, String name, double salary, String programmingLanguage) {
        super(empId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void showLanguage() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class FALL2 {
    static void main(String[] args) {
        Manager m = new Manager(101, "Mercin", 80000, "HR");
        Developer d = new Developer(07, "Bob", 70000, "Java");

        System.out.println("Manager Details");
        m.displayDetails();
        m.showDepartment();

        System.out.println();

        System.out.println("Developer Details");
        d.displayDetails();
        d.showLanguage();
    }
}