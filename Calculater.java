import java.util.Scanner;

class Calculater {
    int calculater(int a, int b) {
        return a + b;
    }

    double calculater(double a, double b) {
        return a - b;
    }

    long calculater(long a, long b) {
        return a * b;
    }

    float calculater(float a, float b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible");
            return 0;
        }
        return a / b;
    }

    static void main(String[] args) {
        Calculater c = new Calculater();
        Scanner sc = new Scanner(System.in);
    }
}
