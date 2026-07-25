class emploey {
    int id;
    String name;

    emploey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
    }
}

public class Paramater {
    static void main(String[] args) {
        emploey emploey = new emploey(1, "Mercin");
        emploey.display();
    }
}