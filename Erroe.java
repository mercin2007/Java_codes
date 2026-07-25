import java.util.Scanner;

public class Erroe {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            int reasult = a / b;
            System.out.println("The result is " + reasult);
        } catch (ArithmeticException e) {
            System.out.println("error:division by zero is not allowed");
        }
        sc.close();
    }
}
