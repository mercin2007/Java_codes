class Stud {
    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Method00 {
    static void main(String[] args) {
        Stud s1 = new Stud();
        s1.name = "Mercin";
        s1.age = 19;
        Stud s2 = new Stud();
        s2.name = "asin";
        s2.age = 20;
        s1.display();
        s2.display();
    }
}