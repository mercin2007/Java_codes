public class Method8 {
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Method8 obj = new Method8();
        System.out.println(obj.multiply(25, 10));
        System.out.println("result=" + obj.multiply(25, 10));
    }
}
