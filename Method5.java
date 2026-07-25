public class Method5 {
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Method5 obj = new Method5();
        System.out.println(obj.multiply(10, 5));
        System.out.println("result=" + obj.multiply(10, 5));
    }
}
