import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        System.out.println("Enter the price of 5 items");
        Scanner input = new Scanner(System.in);
        double[] price = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter price of " + (i + 1) + " items: ");
            price[i] = input.nextDouble();
            
        }

    }
}
