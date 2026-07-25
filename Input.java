import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks :");
            marks[i] = input.nextInt();
            total += marks[i];
            System.out.println("Total: " + total);
        }
        System.out.println("Average:" + (total / 5.0));
    }
}
