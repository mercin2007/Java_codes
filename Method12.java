public class Method12 {
    void area(int side) {
        System.out.println("Area of side is " + side * side);
    }

    void area(int length, int breadth) {
        System.out.println("Area of side is " + length * breadth);
    }

    public static void main(String[] args) {

        Method12 obj = new Method12();
        obj.area(10);
        obj.area(10, 20);
    }
}
